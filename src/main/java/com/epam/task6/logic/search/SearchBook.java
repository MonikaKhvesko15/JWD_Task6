package com.epam.task6.logic.search;

import com.epam.task6.model.Book;

import java.util.List;


public interface SearchBook {
    List<Book> findBook(String value, List<Book> books) ;
}
