package ru.geekbrains.java3_1.algo1;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;

public class MassiveSort {
    public static void main(String[] args) {
        Random randomNum=new Random();
        int[] myArr; //Определение ссылки на массив
        myArr = randomNum.ints(0, 10).limit(1000000).toArray(); //Создание массива случнайной длины и сохранение ссылки на него
        int len = myArr.length; //Cсылки на длинну массива
//        System.out.println(Arrays.toString(myArr)); проверка
    }
}
