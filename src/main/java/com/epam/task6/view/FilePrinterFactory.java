package com.epam.task6.view;

public class FilePrinterFactory implements PrintFactory {
    @Override
    public Printer createPrinter() {

        return new FilePrinter();
    }
}
