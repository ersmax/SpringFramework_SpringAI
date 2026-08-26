package Section3_AdvancedJava.L113_ConstructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Sarah");

        List<Student> students = new ArrayList<>();

//        old way
//        for (String name : names)
//            students.add(new Students(name));

        // use lambda in Stream Api
        students = names.stream()
                        .map(name -> new Student(name))
                        .toList();
        System.out.println(students);

        // Use constructor reference in Stream API
        List<Student> studs = new ArrayList<>();
        studs = names.stream()
                .map(Student::new) // for every String object coming from the map, create a new Student object
                .toList();
        System.out.println(studs);
    }
}
