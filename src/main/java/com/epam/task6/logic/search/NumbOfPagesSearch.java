package com.epam.task6.logic.search;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class NumbOfPagesSearch implements SearchBook {

    @Override
    public List<Book> findBook(String value, List<Book> books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            String str = Integer.toString(book.getNumbOfPages());
            if (str.equalsIgnoreCase(value)) {
                result.add(book);
            }
        }
        return result;
    }
}
