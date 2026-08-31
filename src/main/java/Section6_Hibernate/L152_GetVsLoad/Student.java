package Section6_Hibernate.L152_GetVsLoad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// the annotation means that this class needs to be represented in the DB and Hibernate will take care of it
@Entity
public class Student {
    @Id
    private int sid;
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int rollNumber) {
        this.marks = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
