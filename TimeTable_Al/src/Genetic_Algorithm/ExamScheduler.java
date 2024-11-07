package Genetic_Algorithm;
import java.util.*;

public class ExamScheduler {

        private final Random random = new Random();
        private final Student obj;// số lượng khung thời gian thi
        private final Map<Integer, List<Integer>> studentExams; // danh sách các môn mà mỗi sinh viên đăng ký

        public ExamScheduler(int numExams, int numSlots, Map<Integer, List<Integer>> studentExams) {
            this.numExams = numExams;
            this.numSlots = numSlots;
            this.studentExams = studentExams;
        }

        public List<int[]> initializePopulation(int populationSize){ // gián mỗi môm học vào 1 khung giờ ngẫu nhiên
            List<int[]> population = new ArrayList<>();
            for (int i = 0; i < populationSize; i++) {
                int[] schedule = new int[numSlots];
                for (int j = 0; j < numSlots; j++) {
                    schedule[j] = random.nextInt(numExams);
                }
                population.add(schedule);
            }
            return population;
        }
        public int calculateConflicts(int[] schedule) { // phần này thì 1 khung giờ có thể có nhiều môn thi nên từ từ suy nghĩ
            int conflicts = 0;
            for (List<Integer> exams : studentExams.values()) {
                for (int i = 0; i < exams.size(); i++) {
                    for (int j = i + 1; j < exams.size(); j++) {
                        if (schedule[exams.get(i)] == schedule[exams.get(j)]) {
                            conflicts++; // Đếm xung đột nếu hai môn có cùng khung thời gian
                        }
                    }
                }
            }
            return conflicts;
        }
        public int[] selectParent(List<int[]> population) {
            population.sort(Comparator.comparingInt(this::calculateConflicts));
            return population.get(0); // Chọn cá thể có ít xung đột nhất
        }
    public int[] crossover(int[] parent1, int[] parent2) {
        int[] child = new int[numExams];
        for (int i = 0; i < numExams; i++) {
            child[i] = (random.nextBoolean()) ? parent1[i] : parent2[i]; // Chọn khung thời gian từ một trong hai cha mẹ
        }
        return child;
    }


}

