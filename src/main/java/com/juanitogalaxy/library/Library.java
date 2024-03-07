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
        System.out.println("wow nc");
        return this.members;
    }

    public void addMember() {
        this.members.put("1", new Member(02, 0424, "Juan Tate"));
        System.out.println(members);

    }

}
