package com.juanitogalaxy.library;

import java.util.HashMap;

import com.juanitogalaxy.library.entities.Book;
import com.juanitogalaxy.library.entities.Member;

public class Library {
    private static Library instance = null;
    private String address;
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();
    private int idIterator = 0;

    public HashMap<String, Book> getBooks() {
        return this.books;
    }

    public HashMap<String, Member> getMembers() {
        return this.members;
    }

    public static Library getInstance() {
        if (instance == null)
            return new Library();
        return instance;
    }

    public void addMember(int phoneNumber, String name) {
        this.members.put(Integer.toString(idIterator), new Member(idIterator, phoneNumber, name));
        idIterator++;

    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }

    public void setMembers(HashMap<String, Member> members) {
        this.members = members;
    }

    public Member getMember(int id) {
        return members.get(id);
    }

    @Override
    public String toString() {
        return "{" +
                " address='" + getAddress() + "'" +
                ", books='" + getBooks() + "'" +
                ", members='" + getMembers() + "'" +
                "}";
    }
}
