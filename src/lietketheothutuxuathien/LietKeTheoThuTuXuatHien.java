package lietketheothutuxuathien;

import java.io.*;
import java.util.*;

public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // đọc VANBAN.in
        Scanner sc = new Scanner(new File("VANBAN.in"));
        StringBuilder vanban = new StringBuilder();
        while (sc.hasNext()) {
            vanban.append(sc.next()).append(" ");
        }
        String s = vanban.toString();
        List<String> a = Arrays.asList(s.split("\\s+"));
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i).toLowerCase());
        }
        Set<String> a1 = new LinkedHashSet<>(a);
        // đọc NHIPHAN.in
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> input = (ArrayList<String>) ois.readObject();
        for (int i = 0; i < input.size(); i++) {
            input.set(i, input.get(i).toLowerCase());
        }
        Set<String> input1 = new LinkedHashSet<>(input);
        // xử lý đề bài
        a1.retainAll(input1);

        for (String i : a1){
            System.out.println(i);
        }
    }
}
