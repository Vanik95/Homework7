package com.company.Homeworks71To717;

import java.util.ArrayList;
import java.util.Collections;

public class Homework713 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("BMW");
        arrayList.add("Mercedes-Benz");
        arrayList.add("Ferrari");
        arrayList.add("Lamborghini");
        arrayList.add("Mclaren");
        arrayList.add("Lada");
        arrayList.add("Nissan");

        System.out.print(arrayList);
        System.out.println();

        Collections.swap(arrayList, 1, 6);

        System.out.print(arrayList);
    }
}