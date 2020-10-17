package com.epam.task6.logic.search;

import com.epam.task6.data.DataException;
import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSearch implements SearchBook {
    @Override
    public List<Book> findBook(String value, List<Book> books) throws DataException {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(value)) {
                result.add(book);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new IllegalArgumentException("this book is not exist");
    }
}
