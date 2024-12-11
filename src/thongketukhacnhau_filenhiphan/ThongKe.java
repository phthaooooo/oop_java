package thongketukhacnhau_filenhiphan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class ThongKe {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> input = (ArrayList) ois.readObject();
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String i : input) {
            i = i.toLowerCase();
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

        }
        List<Map.Entry<String, Integer>> a = new ArrayList<>(map.entrySet());
        Collections.sort(a, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : a) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
