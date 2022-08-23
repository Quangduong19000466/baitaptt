package data_types_1.java;

import java.util.Scanner;

public class DataTypesI {
    public static void q3(Scanner sc) {
        int number = sc.nextInt();
        if (number > 0 && number < 1000) {
            int sum = 0;
            int a = 0;
            for (int i = 0; i < 3; i++) {
                a = number % 10;
                sum = sum + a;
                number = (number - a) / 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("nhap sai du lieu dau vao , nhap lai:");
            q3(sc);
        }
    }

    public static void q9(Scanner sc) {
        System.out.println("nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("nhap so nguyen b:");
        int b = sc.nextInt();
        System.out.println("Sum of two integers:" + (a + b));
        System.out.println("Difference of two integers:" + (Math.max(a, b) - Math.min(a, b)));
        System.out.println("Product of two integers:" + (a * b));
        System.out.println("Average of two integers :" + (a + b) / 2);
        System.out.println("Distance of two integers :" + Math.abs(a - b));
        System.out.println("Max integer :" + Math.max(a, b));
        System.out.println("Min integer :" + Math.min(a, b));
    }

    public static void q13() {
        int x = -1234;
        int y = 130;
        System.out.println("Phân chia tầng sử dụng toán tử '/':" + (x / y));
        System.out.println("Phân chia tầng sử dụng phương thức floorDiv () là:" + Math.floorDiv(x, y));
        System.out.println("Mô đun tầng sử dụng toán tử '%':" + (x % y));
        System.out.println("Mô đun tầng sử dụng phương thức floorMod() là:" + Math.floorMod(x, y));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //q3(sc);
        q13();

    }
}
