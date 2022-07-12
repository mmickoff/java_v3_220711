package ru.gb.java_v3.java_1.lesson_1;

import java.sql.SQLOutput;

public class Hello_World {

    public static void main(String[] args) {

        System.out.println(longSumm(4, 2, 8, 4, 7));
        System.out.println(limitOfSumm(5, 16));
        System.out.println(limitOfSumm(5, 10));
        System.out.println(positiveOrNegativeNumber(4));
        System.out.println(positiveOrNegativeNumber(-4));
        System.out.println(positiveOrNegativeNumber(0));
        greeting("Николай");
        greeting("Михаил");
        System.out.println(leapYear(2400));
        System.out.println(leapYear(2345));
        System.out.println(leapYear(2100));
        System.out.println(leapYear(400));
        System.out.println(leapYear(500));
        System.out.println(leapYear(2016));

        /*System.out.println((sumOfThreeNumbers (5, 6, 7)));
    }
    private static int sumOfThreeNumbers(int a, int b, int c) {
        return a + b + c;*/
    }

    private static String leapYear(int year) {
        int y4 = year % 4;
        int y100 = year % 100;
        int y400 = year % 400;
        if (y4 == 0 && y100 != 0 || y400 == 0 ) {
            return  String.format("Год " + year + " високосный");
        }
            return String.format("Год " + year + " не високосный");
    }

    private static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }


    public static long longSumm(int a, int b, int c, int d, long e) {
        return (a * (b + (c / d))) * e;
    }

    private static boolean limitOfSumm(int x, int y) {
        int z = x + y;
        if (z > 10 & z <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static String positiveOrNegativeNumber(int i) {
        if(i >= 0){
            return String.format("Число " + i + " положительное");
        }
        return String.format("Число " + i + " отрицательное");
    }


}
