package com.company.Homeworks71To717;

import java.util.ArrayList;
import java.util.Random;

public class Homework712 {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int arrayListLength;
        arrayListLength = random.nextInt(10);
        for (int i = 0; i < arrayListLength; i++) {
            int value = random.nextInt(10);
            arrayList.add(value);
        }
        System.out.print(arrayList);
        System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        int arrayList1Length;
        arrayList1Length = random.nextInt(10);
        for (int i = 0; i < arrayList1Length; i++) {
            int value = random.nextInt(10);
            arrayList1.add(value);
        }
        System.out.print(arrayList1);
        System.out.println();

        if (arrayListLength == arrayList1Length) {
            System.out.println("The array lists are equal.");
        } else if (arrayListLength > arrayList1Length) {
            System.out.println("The first array list is bigger than the second.");
        } else {
            System.out.println("The first array list is smaller than the second.");
        }
    }
}