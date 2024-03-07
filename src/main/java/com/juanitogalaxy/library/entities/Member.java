package com.juanitogalaxy.library.entities;

public class Member {
    private int id;
    private int phoneNumber;
    private String fullName;

    public Member(int id, int phoneNumber, String fullName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                ", fullName='" + getFullName() + "'" +
                "}";
    }

}
