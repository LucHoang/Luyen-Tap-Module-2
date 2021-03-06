package com.qlsv;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Teacher> listTeacher = new ArrayList<>();

//        Teacher teacher1 = new Teacher("Luc", "Nam", "12", "kb", "C1011L", 120000, 240f);
//        Teacher teacher2 = new Teacher("An", "Nam", "12", "kb", "C1011K", 110000, 250f);
//        Teacher teacher3 = new Teacher("Ly", "Nu", "12", "kb", "C1011M", 150000, 230f);
//        Teacher teacher4 = new Teacher("Hau", "Nam", "12", "kb", "C1011G", 140000, 235f);
//
//        listTeacher.add(teacher1);
//        listTeacher.add(teacher2);
//        listTeacher.add(teacher3);
//        listTeacher.add(teacher4);


        int choose;

        try {
            do {
                System.out.println("\n----------------MENU-----------------");
                System.out.println("Chọn 1: Nhập vào n giảng viên");
                System.out.println("Chọn 2: Hiển thị thông tin tất cả các giảng viên ra màn hình");
                System.out.println("Chọn 3: Hiển thị giảng viên có lương cao nhất");
                System.out.println("Chọn 7: Thoát");

                choose = input.nextInt();

                switch (choose) {
                    case 1:
                        System.out.print("So giang vien can nhap: ");
                        int n = input.nextInt();
                        for (int i=1; i<=n; i++) {
                            Teacher teacher = new Teacher();
                            teacher.inputInfo();
                            listTeacher.add(teacher);
                        }
                        System.out.println("Da nhap OK !");
                        break;
                    case 2:
                        if (listTeacher.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            for (Teacher teacher: listTeacher) {
                                System.out.println(teacher.showInfo());
                            }
                        }
                        break;
                    case 3:
                        if (listTeacher.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            float maxLuong = 0;
                            for (Teacher teacher: listTeacher) {
                                if (teacher.tinhLuong()>maxLuong) {
                                    maxLuong = teacher.tinhLuong();
                                }
                            }
                            for (Teacher teacher: listTeacher) {
                                if (teacher.tinhLuong()==maxLuong) {
                                    System.out.printf("Giang vien co luong thuc nhan cao nhat ("+"%.2f"+" VND:)",maxLuong);
                                    System.out.println("\n"+teacher.showInfo());
                                }
                            }
                        }
                        break;
                    case 7:
                        System.out.println("Goodbye!!!");
                        break;
                    default:
                        System.err.println("Lua chon ngoai pham vi !!!");
                }
            } while (choose != 7);
        } catch (InputMismatchException e) {
            System.err.println("Lua chon sai dinh dang !!!");
        }
    }
}
