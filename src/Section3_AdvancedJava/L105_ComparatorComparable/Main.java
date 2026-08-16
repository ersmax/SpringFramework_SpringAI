package Section3_AdvancedJava.L105_ComparatorComparable;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (age > that.age)        return 1;
        else if (age < that.age)   return -1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(49);
        nums.add(32);
        nums.add(10);
        nums.add(26);

        Collections.sort(nums);
        System.out.println(nums);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 % 10 > num2 % 10)
                    return 1;
                else if (num1 % 10 < num2 % 10)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(nums, com);
        System.out.println(nums);


        // Sort by the length of the string
        List <String> names = new ArrayList<>();
        names.add("abcd"); names.add("abc"); names.add("ab"); names.add("a");

        Comparator<String> lengthComparator = (o1, o2) -> {
            if (o1.length() > o2.length())      return 1;
            else if (o1.length() < o2.length()) return -1;
            else                                return 0;
        };

        Collections.sort(names, lengthComparator);
        System.out.println(names);


        // Sort a list of Students based on their age
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Jack"));
        students.add(new Student(30, "Sarah"));
        students.add(new Student(18, "Bob"));
        students.add(new Student(12, "Jack jr."));

        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.age > student2.age)        return 1;
                else if (student1.age < student2.age)   return -1;
                return 0;
            }
        };

        // Logical syntax sugar:
        Comparator<Student> ageComparator2 = (student1, student2) -> (student1.age > student2.age) ? 1 : -1;

        // students.sort(ageComparator);
//        Collections.sort(students, ageComparator);

        // If you implement the interface Comparable in class Student with compareTo:
        Collections.sort(students);

        for (Student s : students)
            System.out.println(s);

    }
}
