package com.epam.task6.model;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int numbOfPages;
    double price;

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

    public String getAuthor() {
        return author;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numbOfPages == book.numbOfPages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numbOfPages, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numbOfPages=" + numbOfPages +
                ", price=" + price +
                '}';
    }
}
