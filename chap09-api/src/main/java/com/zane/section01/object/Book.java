package com.zane.section01.object;

import java.util.Objects;

public class Book /* extends Object */{
    private int number;
    private String title;
    private String author;
    private int price;

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "number=" + number +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        /* 같은 필드 값이 hash 연산에 쓰이면 hash 연산의 결과도 같은 값이 나온다. */
        return Objects.hash(number, title, author, price);
    }
}
