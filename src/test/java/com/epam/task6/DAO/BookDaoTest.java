package com.epam.task6.DAO;

import com.epam.task6.logic.Dao.BookDao;
import com.epam.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BookDaoTest {
    @Test
    public void shouldRemoveSpecifiedBookFromStorage() {
        //given
        List<Book> storage=new ArrayList<>();
        storage.add(new Book("TheGreatGatsby","F.Scott",150,189.00));
        storage.add(new Book("TheLittlePrince","AntoinedeSaint-Exupery",100,45.50));
        BookDao origin=new BookDao(storage);

        List<Book> result=new ArrayList<>();
        result.add(new Book("TheGreatGatsby","F.Scott",150,189.00));

        Book bookRemove=new Book("TheLittlePrince","AntoinedeSaint-Exupery",100,45.50);

        //when
       origin.remove(bookRemove);

       //then
        Assert.assertEquals(storage,result);
   }
}
