package file_input_output_i;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//2	7	5	18
public class FileInputOutputI {

    public static void q2() {
        File file = new File("D:\\nam3\\tinhtoanss");
        String files[] = file.list(new FilenameFilter() {
            //Trả về một mảng các đối tượng File, là các tập tin và các thư mục con của thư mục hiện tại
            // , và phù hợp với bộ lọc FilenameFilter trên tham số.
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".c")) {
                    return true;
                }
                return false;
            }
        });
        for (String f : files) {
            System.out.println(f);
        }
    }

    public static void q7() {
        // file.lastModified trẩ về milliseconds.sử dụng SimpleDateFormat để chuyển đổi sang dạng ngày tháng
        File file = new File("D:\\nam3\\tinhtoanss\\giaithua.c");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(simpleDateFormat.format(file.lastModified()));
    }

    public static void q5() {
        File file = new File("D:\\nam3\\tinhtoanss");
        //file,isDirectory kiểm tra xem là thư mục hay k trả về true false;
        if (file.isDirectory()) {
            System.out.println("la thu muc");
        } else {
            System.out.println("la tep");
        }

    }

    public static void q18() throws FileNotFoundException {
        File file = new File("D:\\nam3\\tinhtoanss\\tepvanban.txt");
        Scanner sc = new Scanner(file);
        String[] array = new String[8];
        int a = 0;
        // lay tung tu cua file gan vao mang array
        while (sc.hasNext()) {
            String str = sc.next();
            array[a] = str;
            a++;
        }
        //lay tung length cua array[i] gan vao gia tri arr[i]
        int arr[] = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i].length();
        }
        //tim gia tri lon nhat cua mang arr
        int max = arr[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }
        }
        // so sanh gia tri lon nhat với tung gia tri leng cua array
        for (int i = 0; i < array.length; i++) {
            if (max == array[i].length()) {
                System.out.println("tu dai nhat là  :" + array[i]);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        q18();
    }
}
