package com.epam.task6.view;

import com.epam.task6.model.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilePrinterTest {

    public static final String OUTPUT_TEST_TXT = "src/test/recourses/outputTest.txt";
    public static final String INVALID_TXT = "invalid.txt";

    @Test
    public void testShouldPrintTextToFileWhenFileExists() throws Exception {
        //given
        FilePrinter printer = new FilePrinter();
        List<Book> origin=new ArrayList<>();
        origin.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        //when
        printer.printListBooks(origin, OUTPUT_TEST_TXT);
    }

    @Test//then
    public void testShouldPrintTextThrowExceptionWhenFileNotExists() throws Exception {
        //given
        FilePrinter printer = new FilePrinter();
        List<Book> origin=new ArrayList<>();
        origin.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        //when
       printer.printListBooks(origin, INVALID_TXT);
    }
}
