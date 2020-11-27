package com.company.Homeworks71To717;

import java.util.ArrayList;
import java.util.Random;

public class Homework714 {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int arrayListLength;
        arrayListLength = random.nextInt(9) + 1;
        for (int i = 0; i < arrayListLength; i++) {
            int value = random.nextInt(10);
            arrayList.add(value);
        }
        System.out.print(arrayList);
        System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        int arrayList1Length;
        arrayList1Length = random.nextInt(9) + 1;
        for (int i = 0; i < arrayList1Length; i++) {
            int value = random.nextInt(10);
            arrayList1.add(value);
        }
        System.out.print(arrayList1);
        System.out.println();
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
    }
}