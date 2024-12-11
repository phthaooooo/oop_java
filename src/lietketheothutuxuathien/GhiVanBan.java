package lietketheothutuxuathien;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GhiVanBan {
    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter("D:\\codeptit_java\\OOP_CodePTIT\\src\\lietketheothutuxuathien\\VANBAN.in");
        BufferedWriter writer = new BufferedWriter(w);
        String s = "hoc vien cong nghe buu chinh vien thong co nhieu sinh vien cong nghe thich hoc";
        writer.write(s);
        writer.close();
    }
}
