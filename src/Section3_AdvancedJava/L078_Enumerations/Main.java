package Section3_AdvancedJava.L078_Enumerations;

enum Status {
    Running, Failed, Pending, Success;  // named constant
}

public class Main {

    public static void main(String[] args) {

        Status s = Status.Running;
        Status[] allStatus = Status.values();
        for (Status status : allStatus)
            System.out.println(status.ordinal() + ") " + status);
    }
}
