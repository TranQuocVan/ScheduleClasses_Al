package HeuristicOptimizer;

import Genetic_Algorithm.Gen;
import Genetic_Algorithm.Individual;
import Genetic_Algorithm.Student;

import java.util.*;

public class HeuristicOptimizer {



    public static List<Gen> createInitialGenes(Map<Integer, List<String>> studentSubjects, List<String> rooms) {
        Map<String, List<Student>> subjectToStudentsMap = new HashMap<>();

        // Nhóm sinh viên theo môn học
        for (Map.Entry<Integer, List<String>> entry : studentSubjects.entrySet()) {
            int studentId = entry.getKey();
            List<String> subjects = entry.getValue();

            for (String subject : subjects) {
                subjectToStudentsMap.putIfAbsent(subject, new ArrayList<>());
                subjectToStudentsMap.get(subject).add(new Student(studentId, "Student " + studentId));
            }
        }

        List<Gen> initialGenes = new ArrayList<>();
        Random random = new Random();

        // Tạo Gen cho mỗi môn học
        for (Map.Entry<String, List<Student>> entry : subjectToStudentsMap.entrySet()) {
            String subject = entry.getKey();
            List<Student> studentsForGen = entry.getValue();
            int timeSlot;

            // Chọn thời gian thi cho môn học
            timeSlot = random.nextInt(20) + 1; // Chọn ngẫu nhiên một thời gian thi

            // Chọn ngẫu nhiên một phòng từ danh sách
            String room = rooms.get(random.nextInt(rooms.size()));

            // Thêm Gen vào danh sách
            initialGenes.add(new Gen(studentsForGen, subject, timeSlot, room)); // Sử dụng phòng ngẫu nhiên
        }

        return initialGenes;
    }

    public static void resolveTimeSlotConflicts(Individual individual) {
        Map<Integer, Set<Integer>> studentTimeSlotMap = new HashMap<>();

        // Duyệt qua tất cả các Gen để kiểm tra xung đột
        for (Gen gen : individual.getGenes()) {
            List<Student> students = gen.getListSt();
            int timeSlot = gen.getTimeSlot();
            boolean hasConflict = false;

            // Kiểm tra xung đột thời gian cho từng sinh viên
            for (Student st : students) {
                studentTimeSlotMap.putIfAbsent(st.getId(), new HashSet<>());
                if (studentTimeSlotMap.get(st.getId()).contains(timeSlot)) {
                    hasConflict = true;
                    break;
                }
            }

            if (hasConflict) {
                // Xử lý xung đột: Thay đổi thời gian thi
                int newTimeSlot;
                boolean validTimeSlot;
                do {
                    newTimeSlot = new Random().nextInt(20) + 1; // Chọn ngẫu nhiên một thời gian thi mới
                    validTimeSlot = true; // Giả định rằng thời gian thi là hợp lệ

                    // Kiểm tra xem thời gian thi mới có gây xung đột không
                    for (Student st : students) {
                        if (studentTimeSlotMap.get(st.getId()).contains(newTimeSlot)) {
                            validTimeSlot = false; // Nếu có xung đột, đánh dấu là không hợp lệ
                            break;
                        }
                    }
                } while (!validTimeSlot); // Lặp lại cho đến khi tìm được thời gian thi hợp lệ

                // Cập nhật thời gian thi cho Gen
                gen.setTimeSlot(newTimeSlot);
            }

            // Cập nhật map thời gian thi cho sinh viên
            for (Student st : students) {
                studentTimeSlotMap.get(st.getId()).add(gen.getTimeSlot());
            }
        }
    }
}
