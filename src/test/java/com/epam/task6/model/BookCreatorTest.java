package com.epam.task6.model;

import org.junit.Assert;
import org.junit.Test;

public class BookCreatorTest {

    public static final String REGEX = "\\s+";

    @Test
    public void shouldCreateBookFromString() {
        //given
        String localBook = "Dracula BramStoker 260 76.00";
        BookCreator creator = new BookCreator();
        Book original = new Book("Dracula", "BramStoker", 260, 76.00);

        //when
        Book resultBook = creator.createBook(localBook);

        //then
        Assert.assertEquals(original, resultBook);
    }
}
