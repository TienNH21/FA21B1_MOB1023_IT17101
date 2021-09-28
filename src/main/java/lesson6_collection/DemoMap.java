package lesson6_collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> diemTP = new HashMap<String, Integer>();

        diemTP.put("lab_1", 10);
        diemTP.put("lab_2", 7);
        diemTP.put("lab_3", 8);
        System.out.println(diemTP);

        diemTP.put("lab_1", 5);
        System.out.println(diemTP);
    }
}
