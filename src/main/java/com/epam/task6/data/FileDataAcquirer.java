package com.epam.task6.data;

import com.epam.task6.model.Book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    @Override
    public List<String> getData(String filename) throws IOException {

        List<String> result = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }

        } catch (IOException e) {
           throw new FileNotFoundException();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return result;
    }
}
