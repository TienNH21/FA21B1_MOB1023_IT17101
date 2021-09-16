package luyen_tap_1;

public class SinhVien extends Nguoi {
    private String maSV;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, int gioiTinh, String queQuan, String diaChi) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public String xuatThongTin() {
        String infoCoBan = super.xuatThongTin();
        return this.maSV + " - " + this.chuyenNganh + " - " + infoCoBan;
    }
}
