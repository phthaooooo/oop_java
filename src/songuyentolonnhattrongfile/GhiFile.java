package songuyentolonnhattrongfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiFile {
    public static void main (String[] args) throws FileNotFoundException {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            a.add(i);
        }
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\songuyentolonnhattrongfile\\MUAHANG.in"));
            o.writeObject(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\songuyentolonnhattrongfile\\MUAHANG.in"))) {
            ArrayList readPerson = (ArrayList) ois.readObject();
            System.out.println("Object đã đọc từ file: " + readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
