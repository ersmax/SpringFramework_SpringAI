package Section3_AdvancedJava;

interface A {
    void run();
}

public class Playground2 {

    int a = 5;
//    A obj = new A() {
//
//        @Override
//        public void run() {
//            System.out.println(this.a);
    //        }
//    };
    A obj = () -> System.out.println(this.a);

    public static void main(String[] args) {
      Playground2 ob = new Playground2();
      ob.obj.run();
    }
}
