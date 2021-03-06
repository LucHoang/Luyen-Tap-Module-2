package com.qlsv;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String date;
    private String address;

    public Person() {

    }

    public Person(String name, String gender, String date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String nawe) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        name = input.nextLine();

        System.out.print("Nhap gioi tinh: ");
        gender = input.nextLine();

        System.out.print("Nhap ngay sinh: ");
        date = input.nextLine();

        System.out.print("Nhap dia chi: ");
        address = input.nextLine();
    }

    public String showInfo() {
        return "Ho ten: "+name+", Gioi tinh: "+gender+", Ngay sinh: "+date+", Dia chi: "+address;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'';
    }
}
