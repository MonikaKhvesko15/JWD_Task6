package com.epam.task6.data;

import com.epam.task6.model.Book;

import java.io.IOException;
import java.util.List;

public interface DataAcquirer {
    List<String> getData(String filename) throws IOException,  DataException;
}
