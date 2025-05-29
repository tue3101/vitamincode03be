package main.com.vitamincode03;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("hello vitamin code 03 - git! - TueNguyen");
        System.out.println("hello admin");
        calNumberANumberB();
        timnghiem();
        tinhHCN();
    }

    public static void calNumberANumberB() {
        System.out.println("Nhap vao hai so : ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (float) (a / b));
        } else {
            System.out.println("Không thể chia cho 0");
        }
    }

    public static void timnghiem() {
        System.out.println("Nhap vao cac he so a, b, c : ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        if (b != 0) {
            float x = (float) (c - a) / b;
            System.out.println("nghiem x = " + x);
        } else {
            if (a == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

    public static void tinhHCN() {
        System.out.println("Nhap vao 1 canh a va b");
        System.out.println("\nchieu dai: ");
        double cd = sc.nextDouble();
        System.out.println("\nchieu rong : ");
        double cr = sc.nextDouble();

        double chuVi = (cd + cr) * 2;
        double dienTich = cd * cr;
        double canhnho = Math.min(cd, cr);

        System.out.println("\nChu vi HCN: " + chuVi);
        System.out.println("\nDien tich HCN: " + dienTich);
        System.out.println("\nCanh nho hon: " +canhnho);
    }

}