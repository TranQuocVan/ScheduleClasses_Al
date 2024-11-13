package ObjectBasic;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Subject {
    int idSubject;
    String subjectName;
    List<DetailSubject> detailSubjects;


    public Subject(int idSubject, String subjectName,List<DetailSubject> detailSubjects) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.detailSubjects = detailSubjects;

    }

    public int getIdSubject() {
        return idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public List<DetailSubject> getDetailSubjects() {
        return detailSubjects;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Nếu đối tượng so sánh là chính nó
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Kiểm tra nếu đối tượng so sánh không phải cùng lớp hoặc là null
        }
        Subject other = (Subject) obj; // Ép kiểu đối tượng so sánh về Subject
        return idSubject == other.idSubject; // So sánh idSubject của cả hai đối tượng
    }

}
