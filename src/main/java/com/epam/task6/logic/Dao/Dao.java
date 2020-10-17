package com.epam.task6.logic.Dao;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();

    void add(T t);
    void remove(T t) throws DataException;
    List<T> findByTag(Field field, String value)throws DataException;
    List<T> sortByTag(Field field)throws DataException;

}
