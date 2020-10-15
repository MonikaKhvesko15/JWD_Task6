package com.epam.task6.logic.DAO;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public interface DAO<T> {

    List<T> getAll();

    void add(T t);
    void remove(T t) throws DataException;
    List<T> findByTag(Field field, String value)throws DataException;
    List<T> sortByTag(Field field)throws DataException;

}
