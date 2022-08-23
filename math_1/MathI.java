package math_1;


import java.util.Scanner;

public class MathI {
    //4	9	12	17	23
    public static void q4(Scanner sc) {
        System.out.println("nhap so thap phan:");
        double a = sc.nextDouble();
        System.out.println("nhap phan muon lam tron den :");
        double n = sc.nextDouble();
        System.out.println(Math.floor(a * Math.pow(10, n)) / Math.pow(10, n));
    }

    //Write a Java program to convert a float value to absolute value.
    public static void q9(Scanner sc) {
        float number = sc.nextFloat();
        float absvalue = (number >= 0) ? number : -number;
        System.out.println("The absolute value " + absvalue);
    }

    //Write a Java program to count the number
    // of prime numbers less than a given positive number
    public static void q12() {
        int n = 100;
        int sumPrime = 0;
        for (int i = 2; i <= n; i++) {
            if (ccheckIsPrime(i)) {
                sumPrime++;
                System.out.print(i + " ,");
            }
        }
        System.out.println();
        System.out.println("tu 1 den " + n + " co " + sumPrime + " so nguyen to");
    }

    public static boolean ccheckIsPrime(int a) {
        int num = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                num++;
            }
        }
        if (num == 2) {
            return true;
        }
        return false;
    }
    //Write a Java program to calculate and print average
    // (or mean) of the stream of given numbers.
    public static void q17(int a){
        System.out.println(" day so la :" + a);
        int sum = 0;
        int temp =0;
        for(int i = 0; i<20;i++){
            int num = a%10;
            sum +=num;
            a = a/10;
            temp++;
            if(a==0){
                break;
            }
        }
        System.out.println("tb cua day la :" + (sum/temp));

    }
    public static void q27(int m){
            for(int i=0; i<100;i++){
                if(checkFibonacci(i)==m){
                    System.out.println("la so thuoc day fibonaci");
                    break;
                }
            }

    }
    public static int checkFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return checkFibonacci(n - 2) + checkFibonacci(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q4(sc);
        //q9(sc)
        //q12();
        q27(9);

    }
}
