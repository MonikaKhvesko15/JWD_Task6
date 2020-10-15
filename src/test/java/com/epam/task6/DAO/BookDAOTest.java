package com.epam.task6.DAO;

import com.epam.task6.logic.DAO.BookDAO;
import com.epam.task6.logic.DAO.DAO;
import com.epam.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookDAOTest {
    @Test
    public void shouldRemoveSpecifiedBookFromStorage() {
        //given
        List<Book> storage=new ArrayList<>();
        storage.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        storage.add(new Book("TheLittlePrince","AntoinedeSaint-Exupery",100,45.50));
        BookDAO origin=new BookDAO(storage);

        List<Book> result=new ArrayList<>();
        result.add(new Book("TheGreatGatsby","F.Scott",150,189.00));

        Book bookRemove=new Book("TheLittlePrince","AntoinedeSaint-Exupery",100,45.50);

        //when
       origin.remove(bookRemove);

       //then
        Assert.assertEquals(storage,result);
   }
}
