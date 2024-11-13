package Genetic_Algorithm;
import ObjectBasic.DetailSubject;
import ObjectBasic.Student;
import ObjectBasic.Subject;

import java.util.*;

public class ExamScheduler {

    private static Random rand = new Random(); // Khởi tạo random một lần

    //Tạo các cá thể ngẫu nhiên
    public static Map<Student, List<Subject>> generateRandomSchedule(List<Student> students, List<Subject> subjects) {
        Map<Student, List<Subject>> schedule = new HashMap<>();

        for (Student student : students) {
            List<Subject> studentSchedule = new ArrayList<>();
            for (Subject subject : student.getSubjects()) {
                List<DetailSubject> availableTimes = subject.getDetailSubjects();
                int randIndex = rand.nextInt(availableTimes.size());
                DetailSubject selectedTime = availableTimes.get(randIndex);

                    studentSchedule.add(new Subject(subject.getIdSubject(), subject.getSubjectName(), Collections.singletonList(selectedTime)));
            }
            schedule.put(student, studentSchedule);
        }

        return schedule;
    }

    // Tạo quần thể với kích thước cho trước,
    public static List<Map<Student, List<Subject>>> generatePopulation(int populationSize, List<Student> students, List<Subject> subjects) {
        List<Map<Student, List<Subject>>> population = new ArrayList<>();

        for (int i = 0; i < populationSize; i++) {
            Map<Student, List<Subject>> individualSchedule = generateRandomSchedule(students, subjects);
            population.add(individualSchedule);
        }

        return population;
    }

    //In ra cá thể
   public static void tostringSchedule( Map<Student, List<Subject>> schedule) {
       for (Map.Entry<Student, List<Subject>> entry : schedule.entrySet()) {
           Student student = entry.getKey();
           List<Subject> studentSchedule = entry.getValue();

           System.out.println("Lịch thi của học sinh: " + student.getName());
           for (Subject subject : studentSchedule) {
               System.out.println("  Môn học: " + subject.getSubjectName());
               for (DetailSubject detailSubject : subject.getDetailSubjects()) {
                   System.out.println("    Thời gian thi: " + detailSubject.getDateExam());
               }
           }
           System.out.println("-------------------------------");
       }
   }
   //In ra quần thể
    public static void tostringPopulation(List<Map<Student, List<Subject>>> listSchedule) {
        int count = 1;
        for (Map<Student, List<Subject>> schedule : listSchedule) {
            System.out.println("CÁ THỂ " + count + ":");
            tostringSchedule(schedule);
            count++;
        }
    }



    // Hàm đánh giá độ tốt của cá thể
    public static int pointEvaluateFitness(Map<Student, List<Subject>> schedule) {
        int count = 0;

        // Duyệt qua từng học sinh trong lịch
        for (Map.Entry<Student, List<Subject>> entry : schedule.entrySet()) {
            List<Subject> studentSchedule = entry.getValue();

            // Tạo một Set để kiểm tra sự trùng lặp
            Set<DetailSubject> checkDetailSubjects = new HashSet<>();

            // Duyệt qua các môn học của học sinh
            for (Subject subject : studentSchedule) {
                // Thêm tất cả DetailSubject của môn học vào Set
                checkDetailSubjects.addAll(subject.getDetailSubjects());
            }

            // Tính số lượng môn học có trùng thời gian thi
            count += studentSchedule.size() - checkDetailSubjects.size();
        }

        return count;
    }
    


}
