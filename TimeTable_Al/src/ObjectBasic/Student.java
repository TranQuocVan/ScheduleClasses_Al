package ObjectBasic;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id ;
    String name ;
    List<Subject> subjects = new ArrayList<>();

    public Student(int id, String name, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.subjects= subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public List<Subject> getSubjects() {
        return subjects;
    }

}
