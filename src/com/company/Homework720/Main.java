package com.company.Homework720;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Adam", "Smith", Author.Gender.MALE);
        Author author2 = new Author("Carlota", "Perez", Author.Gender.FEMALE);
        Author author3 = new Author("Elton", "John", Author.Gender.OTHER);
        ArrayList<Author> arrayListAuthors = new ArrayList<>();
        arrayListAuthors.add(author1);
        arrayListAuthors.add(author2);
        arrayListAuthors.add(author3);

        Book book = new Book("Economics", arrayListAuthors, 100.5);
    }
}
