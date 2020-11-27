package com.company.Homeworks71To717;

import java.util.ArrayList;

public class Homework72 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(45);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(75);
        arrayList.add(85);
        arrayList.add(95);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
    }
}
