package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Title 1", 323));
        books.add(new Book("Title 1", 147));
        books.add(new Book("Title 1", 255));

        Author author = new Author("Jhon", "Walker", books);
        Gson gson = new Gson();
        System.out.println(gson.toJson(author));
    }
}