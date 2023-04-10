package oopackage.HashMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap();
        map.put(1, "Ocak");
        map.put(2, "Şubat");
        map.put("Ocak", 1);
        List<String> list = new ArrayList();
        list.add("ahmet");
        list.add("mehmet");
        map.put("nameList", list);
        System.out.println(map.get("nameList"));
        System.out.println(map.get(1));
        System.out.println(map.get("Ocak"));
    }
}
