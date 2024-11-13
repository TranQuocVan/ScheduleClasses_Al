package Test;

import Genetic_Algorithm.ExamScheduler;
import ObjectBasic.DetailSubject;
import ObjectBasic.Student;
import ObjectBasic.Subject;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Tạo các thời gian thi cho các môn học

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2024, Calendar.NOVEMBER, 20, 7, 30);  // 20 tháng 11, 2024, 9:00 AM
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2024, Calendar.NOVEMBER, 20, 9, 30); // 20 tháng 11, 2024, 2:30 PM
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2024, Calendar.NOVEMBER, 20, 12, 15); // 21 tháng 11, 2024, 10:00 AM
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(2024, Calendar.NOVEMBER, 20, 2, 45); // 21 tháng 11, 2024, 10:00 AM

        DetailSubject subjectMath1 = new DetailSubject(calendar1.getTime(), TimeZone.getDefault());
        DetailSubject subjectMath2 = new DetailSubject(calendar2.getTime(), TimeZone.getDefault());
        DetailSubject subjectMath3 = new DetailSubject(calendar3.getTime(), TimeZone.getDefault());
        DetailSubject subjectMath4 = new DetailSubject(calendar4.getTime(), TimeZone.getDefault());


        // Tạo môn học với nhiều thời gian thi
        List<DetailSubject> mathTimes = new ArrayList<>();
        mathTimes.add(subjectMath1);
        mathTimes.add(subjectMath2);
        mathTimes.add(subjectMath3);
        mathTimes.add(subjectMath4);
        Subject subjectMath = new Subject(101, "Toán học", mathTimes);

        // Tạo môn học khác với thời gian thi khác
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(2024, Calendar.NOVEMBER, 20, 7, 30);  // 22 tháng 11, 2024, 8:30 AM
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(2024, Calendar.NOVEMBER, 20, 9, 30); // 22 tháng 11, 2024, 3:00 PM

        DetailSubject subjectLiterature1 = new DetailSubject(calendar5.getTime(), TimeZone.getDefault());
        DetailSubject subjectLiterature2 = new DetailSubject(calendar6.getTime(), TimeZone.getDefault());

        List<DetailSubject> literatureTimes = new ArrayList<>();
        literatureTimes.add(subjectLiterature1);
        literatureTimes.add(subjectLiterature2);
        Subject subjectLiterature = new Subject(102, "Văn học", literatureTimes);

        // Tạo danh sách môn học
        List<Subject> subjects = new ArrayList<>();
        subjects.add(subjectMath);
        subjects.add(subjectLiterature);

        // Tạo học sinh với các môn học
        List<Student> students = new ArrayList<>();

        List<Subject> student1Subjects = new ArrayList<>();
        student1Subjects.add(subjectMath);
        student1Subjects.add(subjectLiterature);
        Student student1 = new Student(1, "Nguyễn Văn A", student1Subjects);

        List<Subject> student2Subjects = new ArrayList<>();
        student2Subjects.add(subjectMath);
        Student student2 = new Student(2, "Trần Thị B", student2Subjects);

        students.add(student1);
        students.add(student2);

        // Gọi hàm generateRandomSchedule để tạo lịch thi ngẫu nhiên cho học sinh
        Map<Student, List<Subject>> schedule = ExamScheduler.generateRandomSchedule(students, subjects);

        // In kết quả ra màn hình
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
}