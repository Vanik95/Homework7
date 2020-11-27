package com.company.Homeworks71To717;

import java.util.ArrayList;
import java.util.Random;

public class Homework716 {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int arrayListLength = random.nextInt(5);
        for (int i = 0; i < arrayListLength; i++) {
            int values = random.nextInt(100);
            arrayList.add(values);
        }

        System.out.println(arrayList.isEmpty());
    }
}