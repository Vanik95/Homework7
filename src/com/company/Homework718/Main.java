package com.company.Homework718;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Product product1 = new Product("PNY GeForce GT 710", random.nextInt(50) + 50, random.nextInt(10));
        Product product2 = new Product("Gigabyte GV-N1030OC-2GI", random.nextInt(50) + 50, random.nextInt(10));
        Product product3 = new Product("Gigabyte GeForce GT 1030", random.nextInt(50) + 50, random.nextInt(10));
        Product product4 = new Product("AMD Radeon RX 550", random.nextInt(50) + 50, random.nextInt(10));
        Product product5 = new Product("MSI GT 1030 2GD4 LP OC", random.nextInt(50) + 50, random.nextInt(10));
        Product product6 = new Product("ZOTAC GeForce GT 730 Zone Edition", random.nextInt(50) + 50, random.nextInt(10));
        Product product7 = new Product("MSI GeForce 210", random.nextInt(50) + 50, random.nextInt(10));
        Product product8 = new Product("Nvidia Quadro M2000", random.nextInt(50) + 50, random.nextInt(10));
        Product product9 = new Product("VisionTek Radeon 7750", random.nextInt(50) + 50, random.nextInt(10));
        Product product10 = new Product("Nvidia NVS 310", random.nextInt(50) + 50, random.nextInt(10));

        ArrayList<Product> arrayListProducts = new ArrayList<>();
        arrayListProducts.add(product1);
        arrayListProducts.add(product2);
        arrayListProducts.add(product3);
        arrayListProducts.add(product4);
        arrayListProducts.add(product5);
        arrayListProducts.add(product6);
        arrayListProducts.add(product7);
        arrayListProducts.add(product8);
        arrayListProducts.add(product9);
        arrayListProducts.add(product10);

        ArrayList<Integer> productRatings = new ArrayList<>();
        productRatings.add(arrayListProducts.get(0).getRating());
        productRatings.add(arrayListProducts.get(1).getRating());
        productRatings.add(arrayListProducts.get(2).getRating());
        productRatings.add(arrayListProducts.get(3).getRating());
        productRatings.add(arrayListProducts.get(4).getRating());
        productRatings.add(arrayListProducts.get(5).getRating());
        productRatings.add(arrayListProducts.get(6).getRating());
        productRatings.add(arrayListProducts.get(7).getRating());
        productRatings.add(arrayListProducts.get(8).getRating());
        productRatings.add(arrayListProducts.get(9).getRating());

        int maxRating = Collections.max(productRatings);
        for (int i = 0; i < arrayListProducts.size(); i++) {
            if (arrayListProducts.get(i).getRating() == maxRating) {
                System.out.println("Title - " + arrayListProducts.get(i).getTitle() + ", rating - " + arrayListProducts.get(i).getRating() + ", price - " + arrayListProducts.get(i).getPrice() + ".");
            }
        }
    }
}