package com.company.Homework722;

public class DistanceConverter {

    Mile mile = new Mile();
    Meter meter = new Meter();
    Inch inch = new Inch();
    Centimeter centimeter = new Centimeter();

    public double convertMilesToMeters(Mile mile) {
        return mile.getMiles() * 1609.344;
    }

    public double convertMetersToMiles(Meter meter) {
        return meter.getMeters() * 0.000621;
    }

    public double convertInchToCentimeter(Inch inch) {
        return inch.getInches() * 2.54;
    }

    public double convertCentimeterToInch(Centimeter centimeter) {
        return centimeter.getCentimeters() * 0.394;
    }
}
