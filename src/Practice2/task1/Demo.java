package Practice2.task1;

import java.util.HashMap;

class Demo {
    static HashMap<String, Long> numberHashMap = new HashMap<>();

    static {
        int NUM_OF_STUDENTS_BOOK = 15404;
        long PHONE_NUMBER = 380989749597L;
        long last2Digits = PHONE_NUMBER % 100;
        long last4Digits = PHONE_NUMBER % 10000;
        int numOfStudents = ((17 - 1) % 26) + 1;

        numberHashMap.put("nosb", (long) NUM_OF_STUDENTS_BOOK);
        numberHashMap.put("pn", PHONE_NUMBER);
        numberHashMap.put("l2d", last2Digits);
        numberHashMap.put("l4d", last4Digits);
        numberHashMap.put("nos", (long) numOfStudents);
    }

    public static void main(String[] args) {
        method1();
    }

    static void method1() {


        System.out.println("Hexal value of your students book" + Long.toHexString(numberHashMap.get("nosb")));
        System.out.println("Last 2 number of your phone " + numberHashMap.get("l2d"));
        System.out.println("Last 4 num of phone " + numberHashMap.get("l4d"));
        System.out.println("Octal value of last 4 numbers - " + Long.toOctalString(numberHashMap.get("l4d")));

        System.out.println("Your number in group" + numberHashMap.get("nos"));
        String alphabet = "abcdefghigklmnopqrstuvwxyz";
        char alphabetValue = alphabet.charAt(numberHashMap.get("nos").intValue());
        System.out.println("Letter " + alphabetValue);
        for (String s : numberHashMap.keySet())
            count(numberHashMap.get(s));
        for (String str : numberHashMap.keySet())
            countOfBinary(Long.toBinaryString(numberHashMap.get(str)));

    }

    static void count(long number) {
        System.out.println("\n" + number);
        int counterForEven = 0;//чет
        int counterForOdd = 0;//нечет
        while (number != 0) {
            if (number % 2 == 0) {
                counterForEven++;
            } else {
                counterForOdd++;
            }
            number /= 10;
        }
        System.out.println("количество четных " + counterForEven);
        System.out.println("количество  не четных " + counterForOdd);
    }

    static void countOfBinary(String number) {
        System.out.println("\n" + "//////////////////////////////////");
        System.out.println(number);
        int counterForEven = 0;//чет
        int counterForOdd = 0;//нечет
        for (int i = 0; i < number.length(); i++) {
            char res = number.charAt(i);
            if (res == '1') {
                counterForEven++;
            } else {
                counterForOdd++;
            }
        }
        System.out.println("количество 1 - " + counterForEven);
        System.out.println("количество  0 - " + counterForOdd);
    }
}
