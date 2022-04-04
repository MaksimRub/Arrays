package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random random = new Random();
    PrintStream out = System.out;
    public static void main(String[] args) {

        ArraysTask1 array1 = new ArraysTask1(20);
        ArraysTask2 array2 = new ArraysTask2(20);
        //array2.fillArray(100,20);
        array1.fillArray(100, 20);
        System.out.println(array1.linearSearch(5));
        //TODO создайте второй массив из 20 элементов, заполните его одинаковыми значениями, используя метод fill класса Arrays
        int ar[]=new int[20];
        Arrays.fill(ar,3,12,random.nextInt());
        System.out.println(Arrays.toString(ar));
        //array2.sort();
        array2.anotherSort();
        array2.print();

        //System.out.println(array2.binarySearch(4));
        //TODO создайте массив из 20 элементов класса ArraysTask2, заполните его случайными значениями,
        //TODO найдите в этом массиве введенное пользователем число бинарным поиском

    }
}

