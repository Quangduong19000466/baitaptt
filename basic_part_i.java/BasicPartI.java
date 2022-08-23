package basic_part_i.java;

import java.util.Scanner;

public class BasicPartI {

    public static void q14() {
        System.out.println("* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================");
    }

    public static void q35(Scanner sc) {
        System.out.println("nhap so canh:");
        int n = sc.nextInt();
        System.out.println("nhap chieu dai moi canh:");
        int s = sc.nextInt();
        System.out.println((n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n)));
    }

    public static void q61(Scanner sc) {
        String n = sc.nextLine();
        StringBuilder str = new StringBuilder(n);
        System.out.println(str.reverse().toString());
    }

    public static void q110() {
        int a = 10, b = 12;
        while (b != 0) {
            int cry = (a & b);
            a = a ^ b;
            b = cry << 1;
        }
        System.out.println(a);
    }

    public static void q137(){
        int[][] obstacle_Grid ={
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };

        int m = obstacle_Grid.length;
        if(m <= 0){
            return;
        }
        int n = obstacle_Grid[0].length;
        if(n <= 0){
            return;
        }
        int [][] newArray = new int[m+1][n+1];
        newArray[m][n-1] = 1;
        for(int i = 0;i<newArray.length;i++){
            for(int j = 0; j< newArray.length; j++){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q14();
        //q35(sc);
        //q61(sc);
        //q110();
        q137();
    }
}
