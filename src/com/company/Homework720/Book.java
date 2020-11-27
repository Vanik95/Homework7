package com.company.Homework720;

import java.util.ArrayList;

public class Book {

    //region Properties

    private String title;
    private ArrayList<Author> author;
    private double price;

    //endregion

    //region Constructors

    public Book() {
    }

    public Book(String title, ArrayList<Author> author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //endregion

    //region Public Methods
    //endregion

    //region Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<Author> author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //endregion
}
