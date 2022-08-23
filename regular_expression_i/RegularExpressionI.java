package regular_expression_i;
//4	8	17	22	12
public class RegularExpressionI {
    public static void q4(String text){
        if (text.matches("[A-Z][a-z]+$"))
            System.out.println( "Found a match!");
        else
            System.out.println("not Found a match!");
    }
    public static void q8(String text){
        if (text.matches("^[a-zA-Z0-9_]*$"))
            System.out.println( "Found a match!");
        else
            System.out.println("Not matched!");
    }
    public static void q22(String str){
        if((str.length()==10) && (str.charAt(0) == '0')&&
                (str.charAt(1)=='3') && (str.charAt(2) <='9' && str.charAt(2) >='2') &&
                (str.charAt(2) <='9' && str.charAt(2) >='0')){
            System.out.println("so dien thoan hop le cua viettel");
        }
        else {
            System.out.println("so dien thoai k hop le");
        }

    }
    public static void main(String[] args) {
        q22("0300909090");
    }

}
