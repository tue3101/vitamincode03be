package main.com.vitamincode03;

import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("hello vitamin code 03 - git! - TueNguyen");
        System.out.println("hello admin");
        calNumberANumberB();
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
            System.out.println("a / b = " + (float)(a / b));
        } else {
            System.out.println("Không thể chia cho 0");
        }
    }
}