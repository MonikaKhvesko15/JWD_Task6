package com.epam.task6.logic.search;

import com.epam.task6.model.Book;

import java.util.*;

public class AuthorSearch implements SearchBook {
    @Override
    public List<Book> findBook(String value, List<Book> books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(value)) {
                result.add(book);
            }
        }
        return result;
    }
}
