package com.epam.task6.logic.DAO;

import com.epam.task6.logic.Field;
import com.epam.task6.logic.search.SearchBook;
import com.epam.task6.logic.search.factory.CreateSearch;
import com.epam.task6.logic.search.factory.SearchBookFactory;
import com.epam.task6.logic.sort.SortBook;
import com.epam.task6.logic.sort.factory.CreateSort;
import com.epam.task6.logic.sort.factory.SortBookFactory;
import com.epam.task6.model.Book;
import org.apache.log4j.Logger;

import java.util.List;


public class BookDAO implements DAO<Book> {

    private static final Logger log = Logger.getLogger(BookDAO.class);
    private List<Book> books;

    public BookDAO(List<Book> books) {

        this.books = books;
    }

    public List<Book> getBooks() {

        return books;
    }

    @Override
    public List<Book> getAll() {

        return books;
    }

    @Override
    public void add(Book book) {

        books.add(book);
    }

    @Override
    public void remove(Book book) {
        boolean result = books.remove(book);
        if (!result) {
            log.warn("book not found in list");
        }
    }

    @Override
    public List<Book> findByTag(Field field, String value) {
        CreateSearch search = new SearchBookFactory();
        SearchBook searchBook = search.createSearchBook(field);
        return searchBook.findBook(value, this.books);
    }

    @Override
    public List<Book> sortByTag(Field field) {
        CreateSort sort = new SortBookFactory();
        SortBook sortBook = sort.createSortBook(field);
        return sortBook.sortBook(this.books);
    }
}
