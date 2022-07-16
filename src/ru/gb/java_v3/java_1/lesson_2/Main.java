package ru.gb.java_v3.java_1.lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println(power(2, 62));
//        arraysExample();




    }

    private static void arraysExample() {
        int[] arr;
        arr = new int[10];
        arr[0] = 10;
        arr[1] = 5;
        int[] ar0 = arr;
        ar0[0] = 4;
        System.out.println(arr[0]);
        String[] ar1 = {"Hello", "Java", "World"};
        String[] ar2 = {"Hello", "World"};
        printArray(ar1);
        printArray(ar2);

        System.out.println(Arrays.toString(ar1));
    }

    private static void printArray(String[] a) {
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i] + ", ");
        }
    }

    public static long power(long base, long sign) {
        long result = 1;
        for (int i = 0; i < sign; i++) {
            result = result * base;
        }
        return result;
    }


}
