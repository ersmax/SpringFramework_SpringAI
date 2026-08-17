package Section2_CoreJava.L037_ArrayOfObjects;

class Student
{
    int rollNo;
    String name;
    int marks;
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Name";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Name2";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Name3";
        s3.marks = 98;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int idx = 0; idx < students.length; idx++)
            System.out.println(students[idx].name + " (" +
                               students[idx].rollNo + ") got " +
                               students[idx].marks);

        for (Student student : students)
            System.out.println(student.name + " (" +
                               student.rollNo + ") got " +
                               student.marks);
    }
}
