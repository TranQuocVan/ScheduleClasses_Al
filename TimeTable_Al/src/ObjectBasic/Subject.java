package ObjectBasic;

import java.util.Date;
import java.util.TimeZone;

public class Subject {
    int idSubject;
    String subjectName;
    Date dateExam ;
    TimeZone timeExam ;

    public Subject(int idSubject, String subjectName, Date dateExam, TimeZone timeExam) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.dateExam = dateExam;
        this.timeExam = timeExam;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public TimeZone getTimeExam() {
        return timeExam;
    }
}
