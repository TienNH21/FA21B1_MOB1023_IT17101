package lesson8_exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import luyen_tap_1.QuanLyDanhSach;

public class DemoMultiException {
    public static void main(String[] args) {
        String[] s = { "1", "2", "abc", "4", null, "5" };
        //              0    1    2      3    4     5      6
        for (int i = 0; i < 7; i++) {
            /*
             * 1 try -> nhiều catch -> tối đa 1 finally
             */
            try {
                // Mở file
                int t = Integer.parseInt(s[i]);
                System.out.println(t);
            } catch (NumberFormatException e) {
                System.out.println("-----------------");
                e.printStackTrace();
                System.out.println("-----------------");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("-----------------");
                e.printStackTrace();
                System.out.println("-----------------");
            } catch (Exception e) {
                //
            } finally {
                // Đóng file
                System.out.println("================");
            }
        }
    }
}
