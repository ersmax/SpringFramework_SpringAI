package Section2_CoreJava.L042_Encapsulation;

class Human
{
    private int age;
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Human aHuman = new Human();
        aHuman.setAge(10);
        aHuman.setName("Pippo");
        System.out.println(aHuman.getName() + ", " + aHuman.getAge());
    }
}
