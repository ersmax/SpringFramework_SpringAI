package Section2_CoreJava.L044_This_keyword;

class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Human aHuman = new Human();
        aHuman.setAge(10);
        System.out.println(aHuman.getAge());
    }

}
