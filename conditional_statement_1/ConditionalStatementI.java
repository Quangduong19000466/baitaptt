package conditional_statement_1;

import java.util.Scanner;

public class ConditionalStatementI {
    public static void q1(Scanner sc) {
        System.out.println("nhap a : ");
        double a = sc.nextDouble();
        if (a > 0) {
            System.out.println(a + " la so duong");
        } else if (a == 0) {
            System.out.println(a + " la so 0");
        } else {
            System.out.println(a + " la so am");
        }
    }

    public static void q8(Scanner sc) {
        String a = sc.nextLine();
        if (a.length() == 1 && (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') && (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')) {
            switch (a) {
                //b, c, d, đ, g, h, k, l, m, n, p, q, r, s, t, v, x
                case "b":
                case "c":
                case "d":
                case "g":
                case "h":
                case "k":
                case "l":
                case "m":
                case "n":
                case "p":
                case "q":
                case "r":
                case "s":
                case "t":
                case "v":
                case "x":
                    System.out.println("la phu am");
                    break;
                default:
                    System.out.println("la nguyen am");
                    break;
            }
        } else {
            System.out.println(" ban nhap sai  nhap lai: ");
            q8(sc);
        }
    }

    public static void q18(Scanner sc) {
        System.out.println("nhap so hang:");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void q24(Scanner sc) {
        System.out.println("nhap so hang:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void q28(int a) {
        if (a == 0) {
            System.out.println("zero");
        } else if (a >= 1) {
            System.out.println("positive");
        } else if (a <= -1) {
            System.out.println("negative");
        } else if (a > 1000000) {
            System.out.println("large");
        } else {
            System.out.println("small");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q1(sc);
        q8(sc);
        //q18(sc);
        //q24(sc);
    }
}
