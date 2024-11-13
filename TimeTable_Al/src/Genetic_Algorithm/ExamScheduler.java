package Genetic_Algorithm;
import ObjectBasic.DetailSubject;
import ObjectBasic.Student;
import ObjectBasic.Subject;

import java.util.*;

public class ExamScheduler {

    private static Random rand = new Random(); // Khởi tạo random một lần

    public static Map<Student, List<Subject>> generateRandomSchedule(List<Student> students, List<Subject> subjects) {
        Map<Student, List<Subject>> schedule = new HashMap<>();

        for (Student student : students) {
            List<Subject> studentSchedule = new ArrayList<>();
            for (Subject subject : student.getSubjects()) {
                // Lấy danh sách thời gian thi của môn học
                List<DetailSubject> availableTimes = subject.getDetailSubjects();

                // Chọn một thời gian thi ngẫu nhiên cho môn học
                int randIndex = rand.nextInt(availableTimes.size());
                DetailSubject selectedTime = availableTimes.get(randIndex);

                // Thêm môn học và thời gian thi vào lịch của học sinh
                studentSchedule.add(new Subject(subject.getIdSubject(), subject.getSubjectName(), Collections.singletonList(selectedTime)));
            }
            schedule.put(student, studentSchedule); // Gán lịch thi cho học sinh
        }

        return schedule;
    }

}
