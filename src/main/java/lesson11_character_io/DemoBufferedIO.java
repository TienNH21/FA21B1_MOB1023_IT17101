package lesson11_character_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoBufferedIO {
    public static void main(String[] args) {
        String filename = "demo_buffered_writer.txt";

        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        
        System.out.println("----------------------");
        
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename) {
        try {
            FileWriter fWriter = new FileWriter(filename);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            
            String[] txt = {
                "Học kỳ FALL 2021 - Block 1\n",
                "Lớp IT17101 - Môn MOB1023\n",
                "Xin chào ong vàng\n"
            };
            
            for (int i = 0; i < txt.length; i++) {
                bWriter.write(txt[i]);
            }
            
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileReader fReader = new FileReader(filename);
            BufferedReader bReader = new BufferedReader(fReader);
            
            while (true) {
                String txt = bReader.readLine();
                
                if (txt == null) {
                    break ;
                }
                
                System.out.println(txt);
            }
            
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
