package luyen_tap_1;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String hoTen;
    private int gioiTinh;
    private String queQuan;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int gioiTinh, String queQuan, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String xuatThongTin() {
        String thongTin = this.hoTen + " - " +
            this.gioiTinh + " - " +
            this.queQuan + " - " +
            this.diaChi;

        return thongTin;
    }
}
