package ObjectBasic;

import java.util.Date;
import java.util.TimeZone;

public class DetailSubject {
    Date dateExam ;
    TimeZone timeExam ;

    public DetailSubject(Date dateExam, TimeZone timeExam) {
        this.dateExam = dateExam;
        this.timeExam = timeExam;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public TimeZone getTimeExam() {
        return timeExam;
    }
}
