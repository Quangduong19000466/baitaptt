package string_i;

import java.util.Scanner;

//4	35	54	73	97
public class StringI {
    public static void q4(){
        String str = "w3rsource.com";
        System.out.println("Original String : " + str);
        int ctr = str.codePointCount(1, 6);
        System.out.println("Codepoint count = " + ctr);
    }
    public static void q35(String str1,String strNew){
        if (strNew.length() == str1.length()) {
            System.out.println(strNew);
            return;
        }
        for (int i = 0; i < str1.length(); i++) {

            q35(str1, strNew + str1.charAt(i));
        }
        
    }

    public static Boolean abcBeforePeriod(String stng) {
        int len = stng.length();
        String abc = "abc";
        Boolean match = false;
        if (len < 3)
            return false;
        for (int i = 0; i < len - 2; i++) {
            String temp = stng.substring(i, i + 3);
            if (temp.compareTo(abc) == 0 && i == 0)
                match = true;
            else if (temp.compareTo(abc) == 0 && stng.charAt(i - 1) != 46)
                match = true;
        }
        return match;
    }
    public static void q73(){
        String str1 =  "testabc.test";
        System.out.println("The given string is: "+str1);
        System.out.println("Is 'abc' appear before period? "+abcBeforePeriod(str1));
    }
    public static String pairsToReturn(String stng)
    {
        String fin_str = "";
        for (int i=0; i<stng.length(); i += 5)
        {
            int end = i + 3;
            if (end > stng.length())
            {
                end = stng.length();
            }
            fin_str = fin_str + stng.substring(i, end);
        }
        return fin_str;
    }
    public static void q97(){
        String str1 =  "w3resource.com";
        System.out.println("The given string is: "+str1);
        System.out.println("The new string is: "+pairsToReturn(str1));
    }
    public static void main(String[] args) {
        q35("PQR","");
        Scanner sc = new Scanner(System.in);
    }
}
