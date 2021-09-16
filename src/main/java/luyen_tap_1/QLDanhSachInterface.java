package luyen_tap_1;

import java.util.ArrayList;

public interface QLDanhSachInterface {
    public void them(Nguoi n);
    public void sua(int viTri, Nguoi n);
    public void xoa(int viTri);
    public ArrayList<Nguoi> getList();
    public void setList(ArrayList<Nguoi> list);
}
