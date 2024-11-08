package Genetic_Algorithm;
import ObjectBasic.Student;
import ObjectBasic.Subject;
import ObjectBasic.Lecture;
import java.util.*;

public class ExamScheduler {

    private final Random random = new Random();
    private final List<Subject> subjects; // Danh sách các môn thi
    private final int numSlots; // Số lượng khung giờ thi
    private final Map<Integer, List<Integer>> studentExams; // Danh sách các môn mà mỗi sinh viên đăng ký

    public ExamScheduler(List<Subject> subjects, int numSlots, Map<Integer, List<Integer>> studentExams) {
        this.subjects = subjects;
        this.numSlots = numSlots;
        this.studentExams = studentExams;
    }

    public List<int[]> initializePopulation(int populationSize) {
        List<int[]> population = new ArrayList<>();
        int numExams = subjects.size(); // Tính số lượng môn thi từ danh sách subjects
        for (int i = 0; i < populationSize; i++) {
            int[] schedule = new int[numExams];
            for (int j = 0; j < numExams; j++) {
                schedule[j] = random.nextInt(numSlots); // Gán mỗi môn học vào một khung giờ ngẫu nhiên
            }
            population.add(schedule);
        }
        return population;
    }

//    public int calculateConflicts(int[] schedule) {
//        int conflicts = 0;
//        for (List<Integer> exams : studentExams.values()) {
//            for (int i = 0; i < exams.size(); i++) {
//                for (int j = i + 1; j < exams.size(); j++) {
//                    if (schedule[exams.get(i)] == schedule[exams.get(j)]) {
//                        conflicts++; // Đếm xung đột nếu hai môn có cùng khung thời gian
//                    }
//                }
//            }
//        }
//        return conflicts;
//    }
//
//    public int[] selectParent(List<int[]> population) {
//        population.sort(Comparator.comparingInt(this::calculateConflicts));
//        return population.get(0); // Chọn cá thể có ít xung đột nhất
//    }
//
//    public int[] crossover(int[] parent1, int[] parent2) {
//        int numExams = subjects.size(); // Tính số lượng môn thi từ danh sách subjects
//        int[] child = new int[numExams];
//        for (int i = 0; i < numExams; i++) {
//            child[i] = random.nextBoolean() ? parent1[i] : parent2[i]; // Chọn khung giờ từ một trong hai cha mẹ
//        }
//        return child;
//    }
}
