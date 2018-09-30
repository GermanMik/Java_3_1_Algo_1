package ru.geekbrains.java3_1.algo1;

import java.util.Scanner;

public class Minimal {
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
        int[] array={a,b,c};
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] < min){//Если значение проверяемой ячейки меньше,
                min = array[i];//то заменяем на текущее
            }
        }
        System.out.println("Минимальное значение" + min );
        }
}