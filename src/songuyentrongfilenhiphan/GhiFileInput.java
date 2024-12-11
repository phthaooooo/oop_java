package songuyentrongfilenhiphan;

import java.io.*;
import java.util.ArrayList;

public class GhiFileInput {
    public static void main(String[] args) {
        String content = "Hello, I'm Phuong Thao";

        try {
            FileWriter fw = new FileWriter("DATA.in");
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            // Ghi nội dung vào file
            bufferedWriter.write(content);
            //Đóng file
            bufferedWriter.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
