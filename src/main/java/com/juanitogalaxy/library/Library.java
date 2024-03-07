package com.juanitogalaxy.library;

import java.util.HashMap;

import com.juanitogalaxy.library.entities.Book;
import com.juanitogalaxy.library.entities.Member;

public class Library {
    private String address;
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();

    public HashMap<String, Book> getBooks() {
        return this.books;
    }

    public HashMap<String, Member> getMembers() {
        return this.members;
    }

    public void addMember(int id, int phoneNumber, String name) {
        this.members.put(Integer.toString(id), new Member(id, phoneNumber, name));
        System.out.println(members);

    }

}
