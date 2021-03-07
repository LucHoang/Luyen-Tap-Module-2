package com.oopInterface.manager;

import com.oopInterface.exam.ColorManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingManagerCat {
    /*
    Hãy xây dựng một giao diện Cat nằm trong gói cat.exam gồm có thuộc tính và phương thức sau:

-          public final String ten = “Meo”;

-          public void nhap();

-          public void hienthi();



+ Xây dựng lớp CatDetail nằm trong gói cat.exam  và thực thi giao diện Cat trên rồi có thêm các thuộc tính:

-          String loai;

-          String mau (Chú ý : Màu nhập vào phải nằm trong ColorManager)

-          String noisong;



Cài đặt các Constructor, các phương thức set/get cho các thuộc tính của lớp và Override các phương thức trong giao diện Cat.

+ Xây dựng lớp ColorManager -> quản lý mày

- ArrayList<String> colorList -> quản lý danh sach màu của mèo.

- nhập và hiển thị mã màu trong lớp này.

+ Cài đặt 1 lớp ManagerCat nằm trong gói manager.cat.

- Khai báo thuộc tính catList kiểu dữ liệu là ArrayList -> được sử dụng để quản lý danh sách mèo nhập vào.



+ Cài đặt 1 lớp UsingManagerCat nằm trong gói manager.cat  có menu sau:

                0.   Nhập danh sách mã màu

1.      Nhập thông tin của n con mèo

2.      Hiển thị thông tin

3.      Sắp xếp danh sách theo mau

4.      Tìm kiếm thông tin theo loai

5.    Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager

6.      Thoát.



Nhiệm vụ:

            Trong lớp UsingManagerCat phải khai báo 1 đối tượng của lớp ManagerCat và viết hàm để nhập vào thông tin của n con mèo.

Các nhiệm vụ: Hiển thị, sắp xếp, tìm kiếm thực hiện trên danh sách thông qua đối tượng của lớp ManagerCat.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ManagerCat managerCat = new ManagerCat();

        int choose;

        try {
            do {
                showMenu();
                choose = input.nextInt();

                switch (choose) {
                    case 0:
                        managerCat.inputMau();
                        managerCat.displayMau();
                        break;
                    case 1:
                        System.out.print("So con meo can nhap: ");
                        int n = input.nextInt();
                        for (int i=1; i<=n; i++) {
                            managerCat.inputCat();
                        }
                        break;
                    case 2:
                        if (managerCat.checkEmpty()) {
                            System.err.println("Danh sach trong !!!");
                        } else {
                            managerCat.displayCat();
                        }
                        break;
                    case 3:
                        if (managerCat.checkEmpty()) {
                            System.err.println("Danh sach trong !!!");
                        } else {
                            managerCat.sortColor();
                        }
                        break;
                    case 4:
                        if (managerCat.checkEmpty()) {
                            System.err.println("Danh sach trong !!!");
                        } else {
                            managerCat.findLoai();
                        }
                        break;
                    case 5:
                        if (managerCat.checkEmpty()) {
                            System.err.println("Danh sach trong !!!");
                        } else {
                            managerCat.sortByColorManager();
                            managerCat.displayCat();
                        }
                        break;
                    case 6:
                        System.out.println("Goodbye !!!");
                        break;
                    default:
                        System.err.println("Lua chon ngoai pham vi !!!");
                        break;
                }
            } while (choose != 6);
        } catch (InputMismatchException e) {
            System.err.println("Lua chon sai dinh dang !!!");
        }
    }


    static void showMenu() {
        System.out.println("\n-----------------------MENU-----------------------");
        System.out.println("0. Nhập danh sách mã màu");
        System.out.println("1. Nhập thông tin của n con mèo");
        System.out.println("2. Hiển thị thông tin");
        System.out.println("3. Sắp xếp danh sách theo mau");
        System.out.println("4. Tìm kiếm thông tin theo loai");
        System.out.println("5. Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("6. Thoát.");
    }
}
