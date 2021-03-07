package com.oopInterface.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
    ArrayList<String> colorList = new ArrayList<>();
    String color;

    public ColorManager() {

    }

    public void inputColor() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap mau can them (An 6 de thoat): ");
            color = input.nextLine();
            if (color.equals("6")) {
                break;
            }
            colorList.add(color);
        }
    }

    public void displayColor() {
        for (String list: colorList) {
            System.out.print("Color: "+list+"\t");
        }
    }

    public boolean checkColor(String color) {
        for (String element: colorList) {
            if (element.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    public int findIndexColor(String color) {
//        for (int i=0; i<colorList.size(); i++) {
//            if (colorList.equals(color)) {
//                return i;
//            }
//        }
//        return -1;

        return colorList.indexOf(color);
    }
}
