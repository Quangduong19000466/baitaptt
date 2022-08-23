package array_i;

import java.util.Scanner;

//9	29	42	48	62
public class ArrayI {
    public static void q9(Scanner sc) {
        int[] array = new int[6];
        System.out.println(" nhap vi tri muon chen:");
        int n = sc.nextInt();
        System.out.println(" nhap gia tri muon chen:");
        int a = sc.nextInt();
        array[n] = a;
        System.out.println(" mang sau khi chen");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Write a Java program to compute the average value of an array of integers except the largest and smallest values.
    public static void q29() {
        int a[] = {9, 2, 3, 4, 1, 6};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int maxAr = a[0];
        int minAr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxAr) {
                maxAr = a[i];
            }
            if (a[i] < minAr) {
                minAr = a[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("trung binh la :" + (sum - maxAr - minAr) / (a.length - 2));

    }

    public static void q42() {
        int array[] = {1, 0, 1, 0, 1, 1, 0, 0, 1};
        int newArray[] = new int[array.length];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[a] = array[i];
                a++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                newArray[a] = array[i];
                a++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void q48() {
        int array[] = {-1, -4, 2, 5, 1, -10, 50};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void q62() {
        int array[] = {-7, 1, 5, 2, -4, 3, 0};
        int sumAr = 0;
        for (int n : array) {
            sumAr += n;
        }
        int newSum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (sumAr - newSum - n == newSum) {
                System.out.println("Equilibrium indices found at :" + i);
            }
            newSum += n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q9(sc);
        //q29();
        //q42();
        //q48();
        q62();
    }
}
