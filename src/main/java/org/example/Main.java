package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Title 1", 323));
        books.add(new Book("Title 1", 147));
        books.add(new Book("Title 1", 255));
        Author author = new Author("Jhon", "Walker", books);

        System.out.println(author.getName());
        System.out.println(author.getLastName());
        System.out.println(author.getPublishedBooks().get(0).getTitle());
        System.out.println(author.getPublishedBooks().get(0).getPages());
        System.out.println(author.getPublishedBooks().get(1).getTitle());
        System.out.println(author.getPublishedBooks().get(1).getPages());
        System.out.println(author.getPublishedBooks().get(2).getTitle());
        System.out.println(author.getPublishedBooks().get(2).getPages());

    }
}