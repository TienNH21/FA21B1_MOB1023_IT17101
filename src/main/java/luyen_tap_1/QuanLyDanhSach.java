package luyen_tap_1;

import java.util.ArrayList;

public class QuanLyDanhSach implements QLDanhSachInterface {
    private ArrayList<Nguoi> list;
    
    public QuanLyDanhSach() {
        this.list = new ArrayList<>();
    }

    @Override
    public void them(Nguoi n) {
        this.list.add(n);
    }

    @Override
    public void sua(int viTri, Nguoi n) {
        this.list.set(viTri, n);
    }

    @Override
    public void xoa(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Nguoi> list) {
        this.list = list;
    }
}
