package com.epam.task6;

import com.epam.task6.data.DataAcquirer;
import com.epam.task6.data.factory.AcquirerFactory;
import com.epam.task6.data.factory.FileDataAcquirerFactory;
import com.epam.task6.logic.DAO.BookDAO;
import com.epam.task6.logic.DAO.DAO;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;
import com.epam.task6.model.BookCreator;
import com.epam.task6.view.FilePrinterFactory;
import com.epam.task6.view.PrintFactory;
import com.epam.task6.view.Printer;
import org.apache.log4j.Logger;

import java.util.List;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static final String FILE_INPUT_TXT = "src/input.txt";
    public static final String FILE_OUTPUT_TXT = "src/output.txt";
    public static final String FIND_BOOK_TXT = "src/findBook.txt";
    public static final String SORTED_BOOKS_TXT = "src/sortedBooks.txt";

    public static void main(String[] args) throws Exception {
        LOGGER.info("Started");

        AcquirerFactory acquirerFactory = new FileDataAcquirerFactory();
        DataAcquirer acquirer = acquirerFactory.createDataAcquirer();
        LOGGER.info("Data Acquirer created");

        List<String> bookList = acquirer.getData(FILE_INPUT_TXT);
        LOGGER.info("Data received from file: " + FILE_INPUT_TXT);

        BookCreator bookCreator = new BookCreator();
        List<Book> books = bookCreator.createList(bookList);
        LOGGER.info("Book Set created " + books);

        DAO bookDAO = new BookDAO(books);
        LOGGER.info("Book DAO created ");

        Book bookAdd = new Book("TheLittlePrince", "AntoinedeSaint-Exupery", 100, 45.50);
        bookDAO.add(bookAdd);
        LOGGER.info("Book " + bookAdd + " added to books " + books);

        Book bookRemove = new Book("TheGreatGatsby", "F.Scott", 150, 189.00);
        bookDAO.remove(bookRemove);
        LOGGER.info("Book " + bookRemove + " removed from books " + books);

        List<Book> findBook = bookDAO.findByTag(Field.PRICE, "45.5");//TITLE,AUTHOR,PAGES;
        LOGGER.info("Books found: " + findBook);

        List<Book> sortedBook = bookDAO.sortByTag(Field.TITLE);//AUTHOR,PAGES,PRICE;
        LOGGER.info("Book sorted: " + sortedBook);

        PrintFactory printFactory = new FilePrinterFactory();
        Printer printer = printFactory.createPrinter();

        printer.printListBooks(bookDAO.getAll(), FILE_OUTPUT_TXT);
        printer.printListBooks(findBook, FIND_BOOK_TXT);
        printer.printListBooks(sortedBook, SORTED_BOOKS_TXT);
        LOGGER.info("Completed successfully");
    }
}
