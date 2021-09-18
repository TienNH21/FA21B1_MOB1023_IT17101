package luyen_tap_1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        QLDanhSachInterface qlds = new QuanLyDanhSach();

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("/******************/");
            System.out.println("Chon:");
            System.out.println("\t1. Them nguoi.");
            System.out.println("\t2. Them sinh vien.");
            System.out.println("\t3. Xuat danh sach.");
            System.out.println("\t0. Dung chuong trinh.");
            System.out.println("/******************/");

            // ...
        }
    }
}
