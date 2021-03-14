package com.epam.task6.model;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    public static final String REGEX = "\\s+";

    public List<Book> createList(List<String> lines) {
        List<Book> books = new ArrayList<>();
        for (String l : lines
        ) {
            Book book = createBook(l);
            books.add(book);
        }
        return books;
    }

    public Book createBook(String line) {
        String[] words = line.split(REGEX);
        String title = words[0];
        String author = words[1];
        Integer numbOfPages = Integer.parseInt(words[2]);
        Double price = Double.parseDouble(words[3]);

        return new Book(title, author, numbOfPages, price);
    }
}
