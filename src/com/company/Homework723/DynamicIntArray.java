package com.company.Homework723;

public class DynamicIntArray {

    private int[] array = new int[0];

    public DynamicIntArray() {
    }

    public DynamicIntArray(int[] array) {
        this.array = array;
    }

    public int[] add(int addingValue) {

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = addingValue;
        array = newArray;
        return array;
    }

    public int[] addAll(int[] newArray) {

        int[] array2 = new int[array.length + newArray.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            array2[array2.length - i - 1] = newArray[newArray.length - i - 1];
        }
        return array2;
    }

    public int contains(int containValue) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == containValue) {
                index = i;
            }
        }
        return index;
    }

    public int[] remove(int removingIndex) {

        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length - removingIndex; i++) {
            newArray[i] = array[i];
        }
        for (int i = removingIndex; i < newArray.length ; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }
}