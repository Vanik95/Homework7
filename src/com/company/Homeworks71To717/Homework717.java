package com.company.Homeworks71To717;

import java.util.ArrayList;
import java.util.Random;

public class Homework717 {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int values = random.nextInt(100);
            arrayList.add(values);
        }
        System.out.print(arrayList);
        System.out.println();
        arrayList.set(1, 88);
        System.out.println(arrayList);
    }
}