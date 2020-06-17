package com.example.sqlite.model;

public class Student {
    int MSSV;
    String name;
    String dateOfBirth;
    String email;
    String address;

    public Student() {
    }

    public Student(int MSSV, String name, String dateOfBirth, String email, String address) {
        this.MSSV = MSSV;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
    }

    public Student(String name, String dateOfBirth, String email, String address) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
    }

    public int getMSSV() {
        return MSSV;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
