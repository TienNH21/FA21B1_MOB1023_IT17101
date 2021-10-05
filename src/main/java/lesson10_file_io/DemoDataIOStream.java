package lesson10_file_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoDataIOStream {
    public static void main(String[] args) {
        String filename = "demo_data_io.txt";

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
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            int i = 20;
            char c = 'B';
            
            dataOS.writeInt(i);
            dataOS.writeChar(c);
            
            
            dataOS.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    public static void docFile(String name) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(name);
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i = dataIS.readInt();
            char c = dataIS.readChar();
            
            System.out.println(i);
            System.out.println(c);
            
            dataIS.close();
        } catch (FileNotFoundException e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        }
    }
}
