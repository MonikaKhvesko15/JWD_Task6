package com.epam.task6.view;

import com.epam.task6.model.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class FilePrinterTest {

    public static final String OUTPUT_TEST_TXT = "src/test/recourses/outputTest.txt";
    public static final String INVALID_TXT = "invalid.txt";

    @Test
    public void testShouldPrintTextToFileWhenFileExists() throws Exception {
        //given
        FilePrinter printer = new FilePrinter();
        Set<Book> origin=new HashSet<>();
        origin.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        //when
        printer.printSetBooks(origin, OUTPUT_TEST_TXT);
    }

    @Test//then
    public void testShouldPrintTextThrowExceptionWhenFileNotExists() throws Exception {
        //given
        FilePrinter printer = new FilePrinter();
        Set<Book> origin=new HashSet<>();
        origin.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        //when
       printer.printSetBooks(origin, INVALID_TXT);
    }
}
