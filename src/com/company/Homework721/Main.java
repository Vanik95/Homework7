package com.company.Homework721;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TV tv = new TV(5, 10, true);

        if (tv.isOn()) {
            System.out.println("Enter volume to increase.");
            int volumeUp = scanner.nextInt();

            System.out.println("Enter volume to decrease.");
            int volumeDown = scanner.nextInt();

            System.out.println("Enter channel to change.");
            int newChannel = scanner.nextInt();

            System.out.println("The new volume level after increasing: " + tv.increaseVolume(volumeUp));
            System.out.println("The new volume level after decreasing: " + tv.decreaseVolume(volumeDown));
            System.out.println("The new channel is: " + tv.changeChannel(newChannel));

        } else {
            System.out.println("The TV is off.");
        }
    }
}