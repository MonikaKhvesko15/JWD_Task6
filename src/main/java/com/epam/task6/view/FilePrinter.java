package com.epam.task6.view;

import com.epam.task6.data.DataException;
import com.epam.task6.data.FileDataAcquirer;
import com.epam.task6.model.Book;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;

public class FilePrinter implements Printer {
    private static final Logger log = Logger.getLogger(FilePrinter.class);

    @Override
    public void printListBooks(List<Book> books, String filename) throws DataException {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"));
            for (Book s : books) {
                printWriter.println(s);
            }
            printWriter.flush();
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (printWriter != null) {
                try {
                    printWriter.close();
                } catch (Exception e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }
}
