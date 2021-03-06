package com.qlsv;

import java.util.*;

public class StudentTest {
    /* Java Basic- OOP - Tổng hợp - Quản lý sinh viên - giáo viên bằng java

Câu 1:
Tạo lớp Person chứa thông tin

- Tên

- Giới tính

- Ngày sinh

- Địa chỉ

Với đầy đủ hàm get set, constructor không tham số, constructor đầy đủ tham số

1. Viết phương thức inputInfo(), nhập thông tin Person từ bàn phím

2. Viết phương thức showInfo(), hiển thị tất cả thông tin Person

Câu 2:
Tạo lớp Student thừa kế Person, lưu trữ các thông tin một sinh viên

- Mã sinh viên: chứa 8 kí tự

- Điểm trung bình: từ 0.0 – 10.0

- Email: phải chứa kí tự @ và không tồn tại khoảng trắng

1. Override phương thức inputInfo(), nhập thông tin Student từ bàn phím

2. Override phương thức showInfo(), hiển thị tất cả thông tin Student

3. Viết phương thức xét xem Student có được học bổng không? Điểm trung bình trên 8.0 là được học bổng

Câu 3:
Tạo lớp StudentTest, chứa Main kiểm tra chức năng lớp Student

Tạo Menu chọn như sau

a. Chọn 1: Nhập vào n sinh viên (n là số lượng sinh viên, được nhập từ bàn phím)

b. Chọn 2: Hiển thị thông tin tất cả các sinh viên ra màn hình

c. Chọn 3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có điểm trung bình thấp nhất

d. Chọn 4: Tìm kiếm sinh viên theo mã sinh viên. Nhập vào mã sinh viên. Nếu tồn tại sinh viên

có mã đó thì in ra màn hình thông tin sinh viên. Nếu không tồn tại thì in ra: Không có sinh

viên nào có mã là <giá trị của mã sinh viên>

e. Chọn 5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ cái (A->Z)

f. Chọn 6: Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo thứ tự điểm cao xuống thấp

g. Chọn 7: Thoát

Câu 4:
Tạo lớp Teacher, kế thừa từ Person, lưu trữ thông tin một giảng viên

- Lớp dạy: Lưu lớp mà giảng viên dạy giống như aptech (ví dụ C1011L, C0903H, C1010KV…)

- Lương một giờ dạy

- Số giờ dạy trong tháng

1. Override phương thức inputInfo(), nhập thông tin Teacher từ bàn phím

2. Override phương thức showInfo(), hiển thị tất cả thông tin Teacher

3. Viết phương thức tính lương thực nhận, trả về lương thực nhận theo công thức:

Nếu lớp dạy là lớp buổi sáng và chiều (Giờ G, H, I, K) thì

Lương thực nhận = lương một giờ dạy * số giờ dạy trong tháng;

Nếu lớp dạy là lớp buổi tối (Giờ L, giờ M) thì

Lương thực nhân = lương một giờ dạy * số giờ dạy trong tháng + 200000đ;

Câu 5:
Tạo lớp TeacherTest, chứa hàm Main kiểm tra chức năng của Teacher

Tạo menu lựa chọn như sau:

a. Chọn 1: Nhập vào n giảng viên (n là số lượng sinh viên, được nhập từ bàn phím)

b. Chọn 2: Hiển thị thông tin tất cả các giảng viên ra màn hình

c. Chọn 3: Hiển thị giảng viên có lương cao nhất

d. Chọn 4: Thoát */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> listStudent = new ArrayList<>();

//        Student student1 = new Student("Luc", "Nam", "12", "kb", "11", 7, "zxc");
//        Student student2 = new Student("Sam", "Nu", "12", "kb", "12", 7.5, "zxc");
//        Student student3 = new Student("An", "Nam", "145", "kbe", "13", 7, "zx547");
//        Student student4 = new Student("Chien", "Nam", "145", "kbe", "110", 4.4, "zx547");
//        listStudent.add(student1);
//        listStudent.add(student2);
//        listStudent.add(student3);
//        listStudent.add(student4);

        int choose = 0;

        try {
            while (choose != 7) {
                System.out.println("\n----------------MENU-----------------");
                System.out.println("Chọn 1: Nhập vào n sinh viên");
                System.out.println("Chọn 2: Hiển thị thông tin tất cả các sinh viên ra màn hình");
                System.out.println("Chọn 3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có điểm trung bình thấp nhất");
                System.out.println("Chọn 4: Tìm kiếm sinh viên theo mã sinh viên");
                System.out.println("Chọn 5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ cái (A->Z)");
                System.out.println("Chọn 6: Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo thứ tự điểm cao xuống thấp");
                System.out.println("Chọn 7: Thoát");

                choose =  input.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("So sinh vien can nhap: ");
                        int number = input.nextInt();
                        for (int i=1; i<=number; i++) {
                            System.out.println("\nSinn vien "+i);
                            Student student = new Student();
                            student.inputInfo();
                            listStudent.add(student);
                        }
                        System.out.println("Da them OK");
                        break;
                    case 2:
                        if (listStudent.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            for (Student element : listStudent) {
                                System.out.println(element.showInfo());
                            }
                        }
                        break;
                    case 3:
                        if (listStudent.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            Collections.sort(listStudent, new Comparator<Student>() {
                                @Override
                                public int compare(Student o1, Student o2) {
                                    return o1.getDtb() > o2.getDtb() ? -1 : 1;
                                }
                            });
                            System.out.println("Sinh vien co diem trung binh thap nhat la: ");
                            System.out.println(listStudent.get(listStudent.size() - 1).showInfo());

                            System.out.println("Sinh vien co diem trung binh cao nhat la: ");
                            System.out.println(listStudent.get(0).showInfo());
                        }
                        break;

                    case 4:
                        if (listStudent.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            System.out.print("Nhap ma sinh vien can tim: ");
                            String msvCanTim = input.nextLine();
                            msvCanTim = input.nextLine();
                            boolean condition = true;

                            for (Student student : listStudent) {
                                if (student.getMsv().equals(msvCanTim)) {
                                    System.out.println(student.showInfo());
                                    condition = false;
                                }
                            }
                            if (condition) {
                                System.out.println("Khong co sinh vien nao co ma la: " + msvCanTim);
                            }
                        }
                        break;
                    case 5:
                        if (listStudent.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            Collections.sort(listStudent, new Comparator<Student>() {
                                @Override
                                public int compare(Student o1, Student o2) {
                                    int temp = o1.getName().compareTo(o2.getName());
                                    return temp>=0?1:-1;
                                }
                            }); // cach sap xep khac: Collections.sort(listStudent);

                            for (Student element : listStudent) {
                                System.out.println(element.showInfo());
                            }
                        }
                        break;
                    case 6:
                        if (listStudent.isEmpty()) {
                            System.out.println("Danh sach trong !!!");
                        } else {
                            Collections.sort(listStudent, new Comparator<Student>() {
                                @Override
                                public int compare(Student o1, Student o2) {
                                    return o1.getDtb() > o2.getDtb() ? -1 : 1;
                                }
                            });

                            boolean condition = true;
                            for (Student student : listStudent) {
                                if (student.checkScholarship()) {
                                    System.out.println(student.showInfo());
                                    condition = false;
                                }
                            }
                            if (condition) {
                                System.out.println("Khong co sinh vien nao duoc hoc bong !");
                            }
                        }
                        break;
                    case 7:
                        //System.exit(1);
                        System.out.println("Goodbye!!!");
                        break;
                    default:
                        System.err.println("Lua chon ngoai pham vi !!!");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Lua chon sai dinh dang !!!");
        }
    }
}
