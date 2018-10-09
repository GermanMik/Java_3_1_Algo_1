package ru.geekbrains.java3_1.algo1;

import java.util.Random;

//        1.	Создать массив большого размера (миллион элементов).
//        2.	Написать методы удаления, добавления, поиска элемента массива.
//        3.	Заполнить массив случайными числами.
//        4.	Написать методы, реализующие рассмотренные виды сортировок и проверить скорость выполнения каждой.
class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        Random randomNum = new Random();
        this.arr = randomNum.ints(0, size - 1).limit(size).toArray(); //Создание массива случнайной длины и сохранение ссылки на него
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public boolean doubleSearch(int i) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (i == this.arr[mid]) {
                return true;
            } else {
                if (i < this.arr[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public void sortInsert(int i) {
        int in, out;
        long startTime = System.currentTimeMillis();// Не получается оценить скорость выполнения
        for (out = 1; out < this.size; out++) {
            int temp = this.arr[out];
            in = out;
            while (in > 0 && this.arr[in - 1] >= temp) {
                this.arr[in] = this.arr[in - 1];
                --in;
            }
            this.arr[in] = temp;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("insert " + i + " Time: " + elapsedTime);
    }

    public void sortBubble(int i) {
        int out, in;
        long startTime = System.currentTimeMillis();
        for (out = this.size - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("SortBubble " + i + " Time: " + elapsedTime);
    }

    private void change(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

}


public class MassiveSort {
    public static void main(String[] args) {
        MyArr array = new MyArr(100000);
//        System.out.println(Arrays.toString(myArr)); //проверка
        System.out.println("Double " + array.doubleSearch(10));
        array.sortInsert(20);
        array.sortBubble(10);
//        array.display();
    }

}



