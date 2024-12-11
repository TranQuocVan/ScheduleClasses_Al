package HeuristicOptimizer;

import Genetic_Algorithm.Gen;
import Genetic_Algorithm.Individual;

import java.util.*;

public class HeuristicOptimizer {
    public static void optimize(Individual individual) {
        List<Gen> genes = individual.getGenes();
//        genes.sort(Comparator.comparing(Gen::getSubject)); // Sắp xếp theo môn học (String)

        // Dùng một map để theo dõi số sinh viên đăng ký mỗi môn học trong từng ngày
        Map<String, Map<Integer, List<Integer>>> subjectDayMap = new HashMap<>(); // Môn học -> Ngày -> Danh sách sinh viên

        // Duyệt qua tất cả các gen và tối ưu hóa
        for (Gen gen : genes) {
            String subject = gen.getSubject();
            int studentId = gen.getStudentId();
            int timeSlot = gen.getTimeSlot();
            int day = (timeSlot - 1) / 4 + 1; // Mỗi ngày có 4 slot (1-4, 5-8, 9-12,...)

            // Nếu môn học chưa có ngày thi, khởi tạo map
            subjectDayMap.putIfAbsent(subject, new HashMap<>());
            subjectDayMap.get(subject).putIfAbsent(day, new ArrayList<>());

            // Thêm sinh viên vào danh sách thi môn trong ngày
            subjectDayMap.get(subject).get(day).add(studentId);
        }

        // Duyệt qua tất cả các môn và điều chỉnh lịch thi nếu quá tải
        for (Map.Entry<String, Map<Integer, List<Integer>>> entry : subjectDayMap.entrySet()) {
            String subject = entry.getKey();
            Map<Integer, List<Integer>> dayMap = entry.getValue();

            for (Map.Entry<Integer, List<Integer>> dayEntry : dayMap.entrySet()) {
                int day = dayEntry.getKey();
                List<Integer> students = dayEntry.getValue();

                // Nếu số lượng sinh viên vượt quá sức chứa phòng
//                if (students.size() > 40) {
//                    // Phân chia sinh viên thành các nhóm nhỏ hơn để phân bổ vào các thời gian thi khác
//                    int numRoomsRequired = (students.size() + 39) / 40; // Tính số phòng cần thiết
//                    int studentsPerRoom = 40;
//
//                    // Tạo các slot thi mới cho sinh viên
//                    for (int i = 0; i < numRoomsRequired; i++) {
//                        int newTimeSlot = findAvailableTimeSlot(subject, day, i, individual);
//                        List<Integer> roomStudents = new ArrayList<>();
//
//                        // Chọn sinh viên vào phòng mới
//                        for (int j = 0; j < studentsPerRoom && !students.isEmpty(); j++) {
//                            roomStudents.add(students.remove(0));
//                        }
//
//                        // Cập nhật thời gian thi cho các sinh viên
//                        for (Integer studentId : roomStudents) {
//                            updateTimeSlotForStudent(individual, studentId, subject, newTimeSlot);
//                        }
//                    }
//                }
            }
        }
    }

    // Tìm một thời gian thi mới cho môn học mà không gây xung đột
    private static int findAvailableTimeSlot(String subject, int day, int roomIndex, Individual individual) {
        Random rand = new Random();
        int timeSlot;

        do {
            timeSlot = (day - 1) * 4 + (roomIndex + 1); // Lấy thời gian thi cho môn trong ngày
        } while (isTimeSlotConflict(individual, subject, timeSlot)); // Kiểm tra xung đột với lịch thi hiện tại

        return timeSlot;
    }

    // Kiểm tra xem thời gian thi có bị xung đột không
    private static boolean isTimeSlotConflict(Individual individual, String subject, int timeSlot) {
        for (Gen gen : individual.getGenes()) {
            if (gen.getSubject().equals(subject) && gen.getTimeSlot() == timeSlot) {
                return true; // Nếu có xung đột
            }
        }
        return false; // Không có xung đột
    }

    // Cập nhật thời gian thi cho sinh viên
    private static void updateTimeSlotForStudent(Individual individual, int studentId, String subject, int newTimeSlot) {
        for (Gen gen : individual.getGenes()) {
            if (gen.getStudentId() == studentId && gen.getSubject().equals(subject)) {
                gen.setTimeSlot(newTimeSlot);
                break;
            }
        }
    }
    }
