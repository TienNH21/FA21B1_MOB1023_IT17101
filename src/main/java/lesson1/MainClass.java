/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        /*
         * Do class SinhVien kế thừa từ class Nguoi, nên đối tượng của class SinhVien
         * cũng có kiểu dữ liệu là Nguoi
         */

        Nguoi obj; // Khai báo biến
        
        // Ép kiểu ngầm định
        // Khởi tạo đối tượng của lớp SinhVien & gán vào biến obj
        obj = new SinhVien("PH00123", 1000, "Nguyen Van A", 20, "123123");
        
        // Ép kiểu tường minh
        SinhVien sv = (SinhVien) new Nguoi("Ng Van B", 30, "123123123");
        
        obj.xuatThongTin();
    }
}
