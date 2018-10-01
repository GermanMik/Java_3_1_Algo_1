package ru.geekbrains.java3_1.algo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Запрашиваем цифры для ввода
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        String intA = input.next();
        int a = Integer.valueOf(intA);
        System.out.println("Введите степень");
        String intN = input.next();
        int n = Integer.valueOf(intN);
        int finalresult = vozvedeineVStepenChetnoe(a, n);
        System.out.println("Результат возведения в степень: " + finalresult);
    }

//    //Возведение в степень
//    public static int finalResult(int a, int n) {
//        int xresult = 1;
//        if (n % 2 == 1) {
//            vozvedeineVStepenChetnoe(a, n);
//        } else {
//            vozvedeineVStepen(a, n);
//        }
//        return;
//
//    }
//
    //Возведение в степень четное
    private static int vozvedeineVStepenChetnoe(int a, int n) {
        int result = 1;
        for (int i = 1; i <= (n - 1); i++) {
            result = result * a;
        }
        return result * a;


    }
//
//    //Возведение в степень
//    private static int vozvedeineVStepen(int a, int n) {
//        int result = 1;
//        for (int i = 1; i <= (n); i++) {
//            result = result * a;
//        }
//        return result;
//    }
}

