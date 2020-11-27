package com.company.Homework722;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DistanceConverter distanceConverter = new DistanceConverter();
        Mile mile = new Mile();
        Meter meter = new Meter();
        Inch inch = new Inch();
        Centimeter centimeter = new Centimeter();

        System.out.println("Enter the miles value.");
        mile.setMiles(scanner.nextDouble());
        System.out.println("Converting miles to meters: " + distanceConverter.convertMilesToMeters(mile));

        System.out.println("Enter the meters value.");
        meter.setMeters(scanner.nextDouble());
        System.out.println("Converting meters to miles: " + distanceConverter.convertMetersToMiles(meter));

        System.out.println("Enter the inches value.");
        inch.setInches(scanner.nextDouble());
        System.out.println("Converting inches to centimeters: " + distanceConverter.convertInchToCentimeter(inch));

        System.out.println("Enter the centimeters value.");
        centimeter.setCentimeters(scanner.nextDouble());
        System.out.println("Converting centimeters to inches: " + distanceConverter.convertCentimeterToInch(centimeter));

    }
}
