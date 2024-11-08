package Test;

import Genetic_Algorithm.ExamScheduler;
import ObjectBasic.Student;
import ObjectBasic.Subject;
import ObjectBasic.Lecture;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo danh sách môn thi
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject(1, "Math", new Date(), TimeZone.getDefault()));
        subjects.add(new Subject(2, "English", new Date(), TimeZone.getDefault()));
        subjects.add(new Subject(3, "Physics", new Date(), TimeZone.getDefault()));
        subjects.add(new Subject(4, "Chemistry", new Date(), TimeZone.getDefault()));

        // 2. Tạo danh sách sinh viên
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 1));
        students.add(new Student(2, "Bob", 2));
        students.add(new Student(3, "Charlie", 3));
        students.add(new Student(4, "David", 4));

        // 3. Mỗi sinh viên đăng ký một số môn thi
        Map<Integer, List<Integer>> studentExams = new HashMap<>();
        studentExams.put(1, Arrays.asList(1, 2));
//        studentExams.put(2, Arrays.asList(2, 3));
//        studentExams.put(3, Arrays.asList(3, 4));
//        studentExams.put(4, Arrays.asList(1, 4));

        // 4. Tạo đối tượng ExamScheduler
        int numSlots = 3;
        ExamScheduler scheduler = new ExamScheduler(subjects, numSlots, studentExams);

        // 5. Khởi tạo quần thể
        int populationSize = 6;
        List<int[]> population = scheduler.initializePopulation(populationSize);

        // 6. In ra quần thể ban đầu
        System.out.println("Initial Population:");
        for (int[] schedule : population) {
            System.out.println(Arrays.toString(schedule));
        }

//        // 7. Tính toán số xung đột cho mỗi cá thể trong quần thể
//        for (int i = 0; i < population.size(); i++) {
//            int[] schedule = population.get(i);
//            int conflicts = scheduler.calculateConflicts(schedule);
//            System.out.println("Schedule " + (i + 1) + " conflicts: " + conflicts);
//        }
//
//        // 8. Chọn cá thể cha mẹ có ít xung đột nhất
//        int[] parent1 = scheduler.selectParent(population);
//        System.out.println("Parent 1 selected: " + Arrays.toString(parent1));
//
//        // 9. Lai ghép hai cá thể để tạo con
//        int[] parent2 = scheduler.selectParent(population); // Sử dụng lại parent1 cho thử nghiệm
//        int[] child = scheduler.crossover(parent1, parent2);
//        System.out.println("Child created by crossover: " + Arrays.toString(child));
    }
}
