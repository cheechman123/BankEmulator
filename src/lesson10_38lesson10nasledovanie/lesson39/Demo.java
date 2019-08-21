package lesson10_38lesson10nasledovanie.lesson39;

public class Demo {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,23,23123};
        int i =0;
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }
        i=0;
        do{
            System.out.println("do");
            System.out.println(arr[i]);
            i++;

        }while (i<arr.length);
    }
}
