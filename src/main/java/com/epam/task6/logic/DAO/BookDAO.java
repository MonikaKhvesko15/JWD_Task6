package com.epam.task6.logic.DAO;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.logic.search.SearchBook;
import com.epam.task6.logic.search.factory.CreateSearch;
import com.epam.task6.logic.search.factory.SearchBookFactory;
import com.epam.task6.logic.sort.SortBook;
import com.epam.task6.logic.sort.factory.CreateSort;
import com.epam.task6.logic.sort.factory.SortBookFactory;
import com.epam.task6.model.Book;
import java.util.Set;

public class BookDAO implements DAO<Book> {
    private Set<Book> books;

    public BookDAO(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public Set<Book> getAll() {
        return books;
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void remove(Book book) throws IllegalArgumentException {
        boolean result = books.remove(book);
        if (!result) {
            throw new IllegalArgumentException("this book is not exist");
        }
    }

    @Override
    public Set<Book> findByTag(Field field, String value) throws DataException {
        CreateSearch search = new SearchBookFactory();
        SearchBook searchBook = search.createSearchBook(field);
        return searchBook.findBook(value, this.books);
    }

    @Override
    public Set<Book> sortByTag(Field field) throws DataException {
        CreateSort sort = new SortBookFactory();
        SortBook sortBook = sort.createSortBook(field);
        return sortBook.sortBook(this.books);
    }
}
