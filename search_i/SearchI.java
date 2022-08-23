package search_i;

import java.util.Scanner;

public class SearchI {
    public static void createArray(Scanner sc, int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("nhap so vi tri array[" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
    }

    public static void printArray(int[][] array) {
        System.out.println("ma tran :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void valuePosition(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == value) {
                    System.out.println(value + " xuat hien o vi tri: [" + i + "][" + j + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int m = sc.nextInt();
        System.out.println("nhap so cot:");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        createArray(sc, array);
        printArray(array);
        valuePosition(array,12);
    }
}
