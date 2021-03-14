package com.epam.task6.logic.sort.factory;

import com.epam.task6.logic.Field;
import com.epam.task6.logic.sort.SortBook;

public interface CreateSort {
    SortBook createSortBook(Field sortField);
}
