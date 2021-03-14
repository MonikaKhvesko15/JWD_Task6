package com.epam.task6.data;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {

    private static final Logger log = Logger.getLogger(FileDataAcquirer.class);

    @Override
    public List<String> getData(String filename) throws IOException, DataException {

        List<String> result = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filename));

            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                result.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        return result;
    }
}
