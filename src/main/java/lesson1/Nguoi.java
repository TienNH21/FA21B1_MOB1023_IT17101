package lesson1;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String cccd;
    
    /*
     * Constructor: Hàm khởi tạo
     * Dùng để khởi tạo đối tượng
     * Contructor có tên trùng với tên Class, ko có kiểu trả về
     */
    public Nguoi(String hoTen, int tuoi, String cccd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cccd = cccd;
    }
    
    public String getHoTen() {
        return this.hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void xuatThongTin() {
        System.out.printf("%s - %s - %d\n", this.cccd, this.hoTen, this.tuoi);
    }
}
