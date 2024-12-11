package capsonguyentotrongfile;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\capsonguyentotrongfile\\DATA2.in");
            ObjectOutputStream dos = new ObjectOutputStream(fos) ;
            List<Integer> a = new ArrayList<>();
            a.add(999773);
            a.add(977357);
            a.add(974417);
            dos.writeObject(a);

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
