package lesson10_38lesson10nasledovanie.lesson35;

public class Demo {
    public static void main(String[] args) {
        Integer i = 9;
        String str = "hell";
        int a = 5;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(i instanceof Integer);
        System.out.println(str + 5 + 6);
        System.out.println(a++ + ++a);
        System.out.println(a-- + --a);
        System.out.println((a>b)?1:2);
        System.out.println(a>b&&b>a);
        System.out.println(a>b||b>a);
        System.out.println(a>b&b>a);//проверяет оба варианта
        System.out.println(a>b|b>a);//проверятется оба варианта
        System.out.println(!(a>b));
        System.out.println(true ^ true);//проверяет разные ли операторы
    }
}
