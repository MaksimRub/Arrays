package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraysTask2 {
    Integer a[];
    int[] b;
    public ArraysTask2(int n){
        a = new Integer[]{-45,78,34,65,-76,-43,-8,4};
        b=new int[a.length];
    }

    //заполнение n элементов массива случайными числами в диапазоне rand
    public void fillArray(int rand, int n){
        Random random = new Random();
        if (n<=a.length)
            for (int i = 0; i < n; i++) {
                a[i] = random.nextInt(rand);
            }
    }
    //TODO напишите метод бинарного поиска элемента num в массиве
    public int binarySearch(int num){
        int lo=0;
        int hi=a.length-1;

        //for (int i = 0; i <hi; i++) {
        //    mid=(lo+hi)/2;
         //   if(a[mid]>num){
         //       hi=hi-mid;
          //  }else if(a[mid]==num){
          //      return mid;
         //   }else{
          //      lo=lo+mid;
          //  }
       //}
       // return -1;



        while(lo<hi){
            int mid=(lo+hi)/2;
            if(a[mid]>num){
                hi=mid-1;
            }else if(a[mid]==num){
                return mid;
            }else{
                lo=mid+1;
            }
        }
        return -1;
    }

    //TODO напишите метод сортировки массива (можно использовать метод класса Arrays)
    public void sort(){
        Arrays.sort(a,new Comp());

    }
    public void print(){
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");

        }
    }

    class Comp implements Comparator<Integer>{



        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1%10<o2%10){
                return -1;
            }
            if(o1%10>o2%10){
                return 1;
            }

            return 0;
        }
    }
    public Integer[] anotherSort(){

        int counter=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<0){
                b[counter]=a[i];
                counter++;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>=0){
                b[counter]=a[i];
                counter++;
            }
        }
        return a;


    }
}
