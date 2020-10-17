package com.epam.task6.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int numbOfPages;
    private double price;

    public Book() {

    }

    public Book(String title, String author, int numbOfPages, double price) {
        this.title = title;
        this.author = author;
        this.numbOfPages = numbOfPages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
