package lesson10_38lesson10nasledovanie.lesson29;

public class A {
    public static void main(String[] args) {
        A a = new A();
        short b = 5;
        a.method(b);
    }

    void method(int i) {
        System.out.println("int");    //1
    }

    void method(long i) {
        System.out.println("long");   //2
    }

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(double i) {
        System.out.println("double");  //3
    }

    void method(short... i) {
        System.out.println("short...");
    }

    void method(Short i) {               //4
        System.out.println("Short");
    }

    void method(Object i) {              //5
        System.out.println("Object");
    }

    void method(Object... i) {
        System.out.println("Object...");
    }

    void method(byte i) {
        System.out.println("byte");
    }


}
