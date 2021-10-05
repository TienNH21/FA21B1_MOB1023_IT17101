package lesson10_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io.txt";

        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Ghi file thành công");
        System.out.println("--------------------------");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Đọc file thành công");
    }

    public static void ghiFile(String name) {
        try {
            FileOutputStream fos = new FileOutputStream(name);
            String txt = "Hello Poly";
            
            byte[] b = txt.getBytes();
            
            fos.write(b);
        } catch (FileNotFoundException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }
    
    public static void docFile(String name) {
        try {
            FileInputStream fis = new FileInputStream(name);

//            byte[] b = fis.readAllBytes();
//            String txt = new String(b);
//            System.out.println(txt);

            while ( fis.available() != 0 ) {
                int i = fis.read();
                char c = (char) i;
                System.out.print(c);
            }
            System.out.println("");

        } catch (FileNotFoundException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }
}
