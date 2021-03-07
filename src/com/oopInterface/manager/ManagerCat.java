package com.oopInterface.manager;

import com.oopInterface.exam.CatDetail;
import com.oopInterface.exam.ColorManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCat {
    ArrayList<CatDetail> catList = new ArrayList<>();
    ColorManager colorManager = new ColorManager();
    Scanner input = new Scanner(System.in);

    public ManagerCat() {

    }

    public void inputMau() {
        colorManager.inputColor();
    }

    public void displayMau() {
        colorManager.displayColor();
    }

    public void inputCat() {
        CatDetail catDetail = new CatDetail();

        System.out.print("Nhap loai: ");
        String loai = input.nextLine();
        catDetail.setLoai(loai);

        System.out.print("Nhap mau: ");
        while (true) {
            String mau = input.nextLine();

            if (colorManager.checkColor(mau)) {
                catDetail.setMau(mau);
                break;
            } else {
                System.err.print("Nhap lai mau (mau phai nam trong ColorManager): ");
            }
        }

        System.out.print("Nhap noi song: ");
        String noisong = input.nextLine();
        catDetail.setNoisong(noisong);

        catList.add(catDetail);
    }

    public void displayCat() {
        for (CatDetail catDetail: catList) {
            catDetail.hienthi();
        }
    }

    public boolean checkEmpty() {
        return catList.isEmpty();
    }

    public void sortColor() {
        Collections.sort(catList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareTo(o2.getMau());
            }
        });
        displayCat();
    }

    public void findLoai() {
        System.out.print("Nhap loai can tim: ");
        String loai = input.nextLine();
        boolean isFind = true;

        for (CatDetail catDetail: catList) {
            if (catDetail.getLoai().equalsIgnoreCase(loai)) {
                catDetail.hienthi();
                isFind = false;
            }
        }
        if (isFind) {
            System.out.println("Khong co loai muon tim !!!");
        }
    }

    public void sortByColorManager() {
        boolean needNextPass = true;
        for (int i=1; i<catList.size() && needNextPass; i++) {
            needNextPass = false;
            for (int j=0; j<catList.size()-i; j++) {
                int index = colorManager.findIndexColor(catList.get(j+1).getMau());
                int currentIndex = colorManager.findIndexColor(catList.get(j).getMau());
                if (currentIndex>index) {
                    CatDetail temp = catList.get(j+1);
                    catList.set(j+1, catList.get(j));
                    catList.set(j, temp);

                    needNextPass = true;
                }
            }
        }
        //Cach khac: them thuoc tinh IDcolor va su dung colections sort
    }
}
