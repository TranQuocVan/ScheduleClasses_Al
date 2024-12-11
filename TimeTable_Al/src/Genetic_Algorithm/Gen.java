package Genetic_Algorithm;

public class Gen {
    private int studentId;
    private String subject;
    private int timeSlot;

    // Constructor
    public Gen(int studentId, String subject, int timeSlot) {
        this.studentId = studentId;
        this.subject = subject;
        this.timeSlot = timeSlot;
    }

    // Getter và Setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Gen{StudentId=" + studentId + ", Subject='" + subject + "', TimeSlot=" + timeSlot + "}";
    }
}
