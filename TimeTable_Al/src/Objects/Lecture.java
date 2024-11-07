package Objects;

public class Lecture {
    int idSubject;
    String nameLecturer;

    public Lecture(int idSubject, String nameLecturer) {
        this.idSubject = idSubject;
        this.nameLecturer = nameLecturer;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public String getNameLecturer() {
        return nameLecturer;
    }
}

