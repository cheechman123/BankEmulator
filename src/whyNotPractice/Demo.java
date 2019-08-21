package whyNotPractice;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static final double FOOTS = 1100;

    public static void main(String[] args) throws IOException {
        Demo demo = new Demo();
        //demo.task1();
        //demo.task2();

        //demo.task3();
        demo.task4();
    }

    void task1() {
        double[] mas = {1, 3, 6, 34, 45, 14};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        mas[index] = (mas[index] * 1.1);
        System.out.println(mas[index]);
    }

    void task2() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Фомичев Антон\\eclipse-workspace\\LessonsYouTube\\src\\whyNotPractice\\text.txt");

        int symbol = 0;
        String str = "";
        while ((symbol = fr.read()) != -1 && ((char) symbol != '.')) {

            str = str.concat(String.valueOf((char) symbol));
        }
        System.out.println(str);
    }

    void task3() throws IOException {
        String str = "бяка бяка бя ка бяак б я к а пипирочка";
        String str_replace = "***********Вырезаное цензурой************";
        str = str.replaceAll("бяка", str_replace);
        System.out.println(str);
    }

    void task4() {
        Scanner sc;
        sc = new Scanner(System.in).useLocale(Locale.US);
        double seconds = sc.nextDouble();
        double res = (double) seconds * FOOTS;
        System.out.println(res + " метров");

    }
}
