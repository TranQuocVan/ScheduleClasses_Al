package ObjectBasic;

import java.util.Date;
import java.util.Objects;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Kiểm tra nếu đối tượng so sánh là chính nó
        if (o == null || getClass() != o.getClass()) return false;  // Kiểm tra null và kiểu lớp

        DetailSubject that = (DetailSubject) o;  // Ép kiểu đối tượng thành DetailSubject

        // So sánh dateExam và timeExam, nếu cả hai giống nhau thì trả về true
        return Objects.equals(dateExam, that.dateExam) && Objects.equals(timeExam, that.timeExam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateExam, timeExam);  // Tạo mã hash dựa trên dateExam và timeExam
    }

}
