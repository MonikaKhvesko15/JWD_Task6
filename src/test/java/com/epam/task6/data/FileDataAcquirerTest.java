package com.epam.task6.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirerTest {
    private final static String FILE_NAME = "src/test/recourses/inputTest.txt";
    public static final String INVALID_FILE = "invalid.txt";

    @Test
    public void testGetDataShouldReadFromFileWhenFileExists() throws DataException, IOException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer();
        List<String> original=new ArrayList<>();
        original.add("Hello world!");
        //when
        List<String> actual = acquirer.getData(FILE_NAME);

        //then
        Assert.assertEquals(original, actual);
    }

    @Test(expected = DataException.class)//then
    public void testGetNumberShouldThrowExceptionWhenFileNotExists() throws IOException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer();
        //when
        acquirer.getData(INVALID_FILE);
    }
}

