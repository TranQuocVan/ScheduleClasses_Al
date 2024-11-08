package ObjectBasic;

public class Student {
    int id ;
    String name ;
    int idSubject;

    public Student(int id, String name, int idSubject) {
        this.id = id;
        this.name = name;
        this.idSubject = idSubject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIdSubject() {
        return idSubject;
    }

}
