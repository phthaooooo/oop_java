package thongketukhacnhau_filenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiFile {
    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            list.add("tuong");
        }
        for (int i = 0; i < 10; i++) {
            list.add("lap");
            list.add("trinh");
            list.add("Tuong");
        }
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\thongketukhacnhau_filenhiphan\\MUAHANG.in"));
            o.writeObject(list);
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\thongketukhacnhau_filenhiphan\\MUAHANG.in"));
            ArrayList readInput = (ArrayList) ois.readObject();
            System.out.println(readInput);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
