package lesson1;

public class SinhVien extends Nguoi
{
    /*
     * Class con kế thừa class cha
     * Class con có quyền truy xuất đến
     * thuộc tính & phương thức KHÔNG PRIVATE của class cha
     */
    
    private String maSV;
    private int soTienTrongViAP;

    public SinhVien(String maSV, int soTienTrongViAP, String hoTen, int tuoi, String cccd) {
        super(hoTen, tuoi, cccd);
        this.maSV = maSV;
        this.soTienTrongViAP = soTienTrongViAP;
    }
    
    public String getMaSV() {
        return this.maSV;
    }

    public void napTienVaoVi(int soTien) {
        this.soTienTrongViAP += soTien;
    }

    public void truTienTrongVi(int soTien) {
        this.soTienTrongViAP -= soTien;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf("%s - %d\n", this.maSV, this.soTienTrongViAP);
    }
    
    /*
     * Overloading
     * Trong cùng 1 class cho phép nhiều hàm có cùng tên
     * nhưng KHÁC THAM SỐ truyền vào
     */
    public void xuatThongTin(String chuyenNganh) {
        System.out.println("Chuyên ngành: " + chuyenNganh);
    }
}
