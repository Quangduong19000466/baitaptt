package method_i;

//2	5	11	13
public class MethodI {


    //Write a Java method to compute the average of three numbers.
    public static void q2(double a, double b, double c) {
        double d = (a + b + c) / 3;
        System.out.println("gia tri tb cua ba so laf:" + d);
    }

    //Write a Java method to count all words in a string.
    public static void q5(String str) {
        int count = 0;
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("chuoi co " + count + " tu");
    }

    public static void q11(String str) {
        if ((str.length() >= 10) && checkKt(str) && checkNumber(str)) {
            System.out.println("mat khau hop le");
        } else {
            System.out.println("mat khau khong hop le");
        }
    }

    public static boolean checkKt(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                count++;
            }
        }
        if (count == str.length()) {
            return true;
        }
        return false;
    }

    public static boolean checkNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1'
                    || str.charAt(i) == '2' || str.charAt(i) == '6'
                    || str.charAt(i) == '3' || str.charAt(i) == '7'
                    || str.charAt(i) == '4' || str.charAt(i) == '8'
                    || str.charAt(i) == '5' || str.charAt(i) == '9'
            ) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void q13(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("s tam giac la : " + s);
        } else {
            System.out.println("tam giac k hop le  nhap lai");
            q13(a, b, c);
        }

    }

    public static void main(String[] args) {
        q11("quangbg122");
        q13(10, 15, 20);


    }
}