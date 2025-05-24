package main.com.vitamincode03;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("hello vitamin code 03 - git! - TueNguyen");
        System.out.println("hello admin");

        timnghiem();
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

}