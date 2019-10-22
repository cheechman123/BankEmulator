package lesson10_38lesson10nasledovanie.lesson34;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        method();
    }
    private static void method(){
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("total memory before " + "%,d\n",runtime.totalMemory() );
        System.out.printf("free memory before " + "%,d\n", runtime.freeMemory() );
        for(int i = 0 ; i<10000000; i++){
            Date date = new Date();
            date = null;
        }
        System.out.printf("total memory after " + "%,d\n",runtime.totalMemory() );
        System.out.printf("free memory after " + "%,d\n", runtime.freeMemory() );
        System.gc();
        System.out.printf("total memory after gc " + "%,d\n",runtime.totalMemory() );
        System.out.printf("free memory after gc " + "%,d\n", runtime.freeMemory() );
    }
    private static void method2(){

    }

}
