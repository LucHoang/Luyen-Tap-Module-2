package com.qlsv;

import java.util.Scanner;

public class Student extends Person implements Comparable<Student>{
    private String msv;
    private double dtb;
    private String email;

    Scanner input = new Scanner(System.in);

    public Student() {

    }

    public Student(String name, String gender, String date, String address, String msv, double dtb, String email) {
        super(name, gender, date, address);
        this.msv = msv;
        this.dtb = dtb;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public boolean setMsv(String msv) {
        if (msv != null && msv.length()==8) {
            this.msv = msv;
            return true;
        } else {
            System.err.print("Nhap lai ma sinh vien (ma sinh vien co 8 ky tu): ");
            return false;
        }
    }

    public double getDtb() {
        return dtb;
    }

    public boolean setDtb(double dtb) {
        if (dtb >= 0.0 && dtb <= 10.0) {
            this.dtb = dtb;
            return true;
        } else {
            System.err.print("Nhap lai diem trung binh (diem >= 0 && diem <= 10): ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.print("Nhap lai email (email phai chua @ va khong co ky tu khoang trang): ");
            return false;
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        System.out.print("Nhap ma sinh vien (8 ky tu): ");
        while (true) {
            String msvInput = input.nextLine();
            boolean check = setMsv(msvInput);
            if (check) {
                break;
            }
        }

        System.out.print("Nhap emali: ");
        while (true) {
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if (check) {
                break;
            }
        }

        System.out.print("Nhap diem trung binh: ");
        while (true) {
            Double dtbInput = input.nextDouble();
            boolean check = setDtb(dtbInput);
            if (check) {
                break;
            }
        }
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Ma sinh vien: "+msv+", Diem trung binh: "+dtb+", Email: "+email;
    }

    public boolean checkScholarship() {
        return dtb>8.0;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() +
                "msv='" + msv + '\'' +
                ", dtb=" + dtb +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
