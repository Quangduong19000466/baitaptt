package nummbers_i_n;
//1	7	14	20	8
public class NumbersI {
    public static void q1(int n){
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x==0)
            System.out.print("It is an ugly number.");
        System.out.print("\n");
    }
    public static void q7(int n){
        System.out.print(2 + " " + 1+ " ");
        int a = 2, b=1,c;
        for(int i = 3;i<=n;i++){
            c = a+b;
            System.out.print(c +" ");
            a = b;
            b= c;
        }
    }
    public static boolean q14(int num){
        int square = num*num;
        while (num>0){
            if(square%10 != num%10){
              return false;
            }
            square /= 10;
            num /=10;
        }
        return true;
    }

    public static void q20(){

    }
    public static void main(String[] args) {
        //q1(18);
        //q7(10);
//        if(q14(26)){
//            System.out.println("Automorphic Number");
//        }else {
//            System.out.println("not Automorphic Number");
//        }
    }
}
