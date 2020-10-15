package com.epam.task6.view;

import com.epam.task6.model.Book;

import java.io.*;
import java.util.List;
import java.util.Set;

public class FilePrinter implements Printer {

    @Override
    public void printListBooks(List<Book> books, String filename) throws Exception {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"));
            for (Book s : books) {
                pw.println(s);
            }
            pw.flush();
        } finally {
            pw.close();
        }
    }
}
