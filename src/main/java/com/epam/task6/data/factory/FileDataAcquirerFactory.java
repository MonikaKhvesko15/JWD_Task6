package com.epam.task6.data.factory;

import com.epam.task6.data.DataAcquirer;
import com.epam.task6.data.FileDataAcquirer;
import com.epam.task6.data.factory.AcquirerFactory;

public class FileDataAcquirerFactory implements AcquirerFactory {
    @Override
    public DataAcquirer createDataAcquirer() {

        return new FileDataAcquirer();
    }
}
