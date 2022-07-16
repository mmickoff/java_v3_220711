package ru.gb.java_v3.java_1.lesson_2;

import java.util.Arrays;

public class HomeWork_2 {

    public static void main(String[] args) {

        changeNumber(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println(Arrays.toString(fillArray(new int[8])));
//        fillArray();
        System.out.println(Arrays.toString(fillArray2(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println(findMinValue(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}) + " - минимальное значение в массиве.");
        System.out.println(findMaxValue(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}) + " - максимальное значение в массиве.");
    }


    private static void changeNumber(int[] arr) {
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] /*void*/ fillArray(int[] arr21) {
//        int[] arr21 = new int[8];
        arr21[0] = 1;
        for (int i = 1; i < arr21.length; i++) {
//            int x += 3;
//            arr21[i] = arr21[i-1] + 3;
            arr21[i] = 1 + 3 * i;
        }
//        System.out.println(Arrays.toString(arr21));
        return arr21;
    }

    private static int[] fillArray2(int[] arr31) {
        for (int i = 0; i < arr31.length; i++) {
            arr31[i] = arr31[i] < 6 ? arr31[i] * 2 : arr31[i];
        }
        return arr31;
    }

    private static int findMinValue(int[] arr41) {
        int min = arr41[0];
        for (int i = 0; i < arr41.length; i++) {
            min = arr41[i] < min ? arr41[i] : min;
        }
        return min;
    }

    private static int findMaxValue(int[] arr41) {
        int max = arr41[0];
        for (int i = 0; i < arr41.length; i++) {
            max = arr41[i] > max ? arr41[i] : max;
        }
        return max;
    }


}

