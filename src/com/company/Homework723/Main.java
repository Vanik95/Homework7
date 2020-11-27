package com.company.Homework723;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        dynamicIntArray.add(random.nextInt(100));
        dynamicIntArray.add(random.nextInt(100));
        dynamicIntArray.add(random.nextInt(100));
        dynamicIntArray.add(4);
        dynamicIntArray.add(random.nextInt(100));

        int[] newArray = {11, 22, 33, 44};
        System.out.println("Add all");
        dynamicIntArray.addAll(newArray);
        for (int i = 0; i < dynamicIntArray.addAll(newArray).length; i++) {
            System.out.print(dynamicIntArray.addAll(newArray)[i] + ", ");
        }

        System.out.println();
        System.out.println("Contain");
        int containValue = 4;
        System.out.println(dynamicIntArray.contains(containValue));

        System.out.println("Remove");
        int removingIndex = 2;
        for (int i = 0; i < dynamicIntArray.remove(removingIndex).length; i++) {
            System.out.print(dynamicIntArray.remove(removingIndex)[i] + ", ");
        }
    }
}
