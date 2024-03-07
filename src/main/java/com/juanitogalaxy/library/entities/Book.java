package com.juanitogalaxy.library.entities;

public class Book {
    private String author;
    private int ISBN;
    private boolean availabilityStatus;

    public Book() {
    }

    public Book(String author, int ISBN) {
        this.author = author;
        this.ISBN = ISBN;
        this.availabilityStatus = true;
    }

    public Book(String author, int ISBN, boolean availabilityStatus) {
        this.author = author;
        this.ISBN = ISBN;
        this.availabilityStatus = availabilityStatus;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public boolean getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String toString() {
        return "{" +
                " author='" + getAuthor() + "'" +
                ", ISBN='" + getISBN() + "'" +
                ", availabilityStatus='" + isAvailabilityStatus() + "'" +
                "}";
    }

}
