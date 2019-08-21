package Practice2.task2;

import java.util.HashMap;

class Demo {
    static HashMap<String, String> numberHashMap = new HashMap<>();

    static {
        int NUM_OF_STUDENTS_BOOK = 15404;
        long PHONE_NUMBER = 380989749597L;
        long last2Digits = PHONE_NUMBER % 100;
        long last4Digits = PHONE_NUMBER % 10000;
        int numOfStudents = ((17 - 1) % 26) + 1;

        numberHashMap.put("nosb", Long.toHexString(NUM_OF_STUDENTS_BOOK));
        numberHashMap.put("pn", Long.toHexString(PHONE_NUMBER));
        numberHashMap.put("l2d", Long.toHexString(last2Digits));
        numberHashMap.put("l4d", Long.toHexString(last4Digits));
        numberHashMap.put("nos", Long.toHexString(numOfStudents));
    }
    public static void main(String[] args) {
        for (String s : numberHashMap.keySet()){
            count(numberHashMap.get(s));
        }
    }
    static void count(String str){
        int counter = 0;
        for (Character character : str.toCharArray() ){
            if(character.toString().matches("[a-fA-F]")){
                counter++;
            }
        }
        System.out.println("For a "+str+ " string, counter = " + counter);
    }
}
