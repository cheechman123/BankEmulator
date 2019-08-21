package lesson10_38lesson10nasledovanie.lesson38;

public class Demo {
    enum Days{MONDAY ,TUESDAY ,WENSDEY ,FRIDAY}
    public static void main(String[] args) {
        Days days = Days.MONDAY;
        int i =5;
        switch(i){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            default:
                System.out.println("default");
                break;
                //в свитч можно ставить только примитивы стринги и enam
                //break можно переносить в любое место в свиче
        }
    }
}
