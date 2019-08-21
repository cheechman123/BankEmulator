package Practice2.task4;

import java.util.HashMap;
import java.util.Scanner;

class Demo {
    static Scanner scanner = new Scanner(System.in);
    static StringBuilder stringBuilder = new StringBuilder("");
    static HashMap<String, Integer> hashMap = new HashMap<>();


    public static void main(String[] args) {
        String choise = "";
        System.out.println("1- enter text");
        System.out.println("2- output text");
        System.out.println("3- count results");
        System.out.println("4- output result");
        System.out.println("5- end");
        while (!choise.equals("-end")) {
            choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    input();
                    break;
                case "2":
                    outputText();
                    break;
                case "3":
                    count();
                    break;
                case "4":
                    outputResults();
                    break;
                case "-end":
                    end();
                    break;
                    default:
                        System.out.println("wrong input");

            }
            choise="";
        }
    }

    static void input() {
        stringBuilder.append(scanner.nextLine());
    }

    static void outputText() {
        System.out.println(stringBuilder.toString());
    }

    static void count() {
        for (String str : stringBuilder.toString().split(" ")) {
            if (hashMap.get(str) == null) {
                hashMap.put(str, 1);
            } else
                hashMap.put(str, hashMap.get(str) + 1);
        }

    }

    static void outputResults() {
        if (hashMap.size() == 0) {
            System.out.println("is empty");
            return;
        }
        System.out.printf("%15s | %5s\n", "Word", "Count");
        for (String s : hashMap.keySet()) {
            System.out.printf("%15s | %5d\n", s, hashMap.get(s));
        }

    }

    static void end() {
        System.exit(0);
    }

}
