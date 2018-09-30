package ru.geekbrains.java3_1.algo1;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        //Запрашиваем цифры для ввода
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 1");
        String intA = input.next();
        int a = Integer.valueOf(intA);
        System.out.println("Введите число 2");
        String intB = input.next();
        int b = Integer.valueOf(intB);
        System.out.println("Введите число 3");
        String intC = input.next();
        int c = Integer.valueOf(intC);

        //Создаем массив
        int[] numbers = {a, b, c};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];// К текущему значению добавляем значение из ячейки
        }
        int average = sum / numbers.length;//делим на число цифр в массиве
        System.out.println("Среднее значение: " + average);
    }
    //Сложность O(n) так как поиск идет по всему массиву n раз
}
