package com.epam.task6.logic.DAO;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;

import java.util.Set;

public interface DAO<T> {

    Set<T> getAll();

    void add(T t);
    void remove(T t) throws DataException;
    Set<T> findByTag(Field field, String value)throws DataException;
    Set<T> sortByTag(Field field)throws DataException;

}
