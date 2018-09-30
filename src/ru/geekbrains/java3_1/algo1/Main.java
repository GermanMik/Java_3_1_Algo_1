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

        //Возведение в степень
        int c = vozvedeineVStepen( a, n);
        System.out.println("Результат возведения в степень: "+c);
    }

    //Возведение в степень
    private static int vozvedeineVStepen(int a, int n) {

        if (n == 0) return 1; // на ноль умножать нельзя
        return vozvedeineVStepen(a, n - 1) * a;
    }
}


