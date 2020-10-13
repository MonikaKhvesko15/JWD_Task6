package com.epam.task6.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCreator {

    public static final String REGEX = "\\s+";

    public Set<Book> createList(List<String> lines) {
        Set<Book> books = new HashSet<>();
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
