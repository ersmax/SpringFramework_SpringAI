package Section3_AdvancedJava.L79_SwitchEnum;

enum Status {
    Running, Failed, Pending, Success;
}

public class Main {
    public static void main(String[] args) {
        Status s = Status.Success;

        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            case Success:
            default:
                System.out.println("Done");
                break;
        }
    }
}
