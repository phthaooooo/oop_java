package lietketheothutuxuathien;

import java.io.*;
import java.util.ArrayList;

public class GhiFile {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\lietketheothutuxuathien\\NHIPHAN.in"));
        ArrayList<String> input = new ArrayList<>();
        input.add("Hoc");
        input.add("vien");
        input.add("cong");
        input.add("nghe");
        oos.writeObject(input);
    }
}
