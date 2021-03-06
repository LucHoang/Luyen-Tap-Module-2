package com.qlsv;

import java.util.Scanner;

public class Teacher extends Person{
    private String lop;
    private int luong;
    private float gioDay;
    Scanner input = new Scanner(System.in);

    public Teacher() {

    }

    public Teacher(String name, String gender, String date, String address, String lop, int luong, float gioDay) {
        super(name, gender, date, address);
        this.lop = lop;
        this.luong = luong;
        this.gioDay = gioDay;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public float getGioDay() {
        return gioDay;
    }

    public void setGioDay(float gioDay) {
        this.gioDay = gioDay;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.print("Nhap lop: ");
        lop = input.nextLine();

        System.out.print("Nhap luong mot gio day: ");
        luong = input.nextInt();

        System.out.print("Nhap so gio day trong thang: ");
        gioDay = input.nextFloat();
    }

    @Override
    public String showInfo() {
        return super.showInfo()+", Lop: "+lop+", Luong mot gio: "+luong+", So gio day trong thang: "+gioDay;
    }

    public float tinhLuong() {
        if (lop.charAt(5)=='G' || lop.charAt(5)=='H' || lop.charAt(5)=='I' || lop.charAt(5)=='K') {
            return luong*gioDay;
        } else if (lop.charAt(5)=='L' || lop.charAt(5)=='M') {
            return luong*gioDay + 20000;
        } else return -1;
    }
}
