package lesson2_interface;

public abstract class Animal {
    private String ten;
    private String mau;

    public Animal() {
    }

    public Animal(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
    
    public abstract void tiengKeu();

    public String getTen() {
        return ten;
    }

    public String getMau() {
        return mau;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
}
