package capsonguyentotrongfile;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {
        try {
            FileInputStream fis = new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\capsonguyentotrongfile\\DATA1.in");
            ObjectInputStream dis = new ObjectInputStream(fis);
            ArrayList<Integer> a = (ArrayList<Integer>) dis.readObject();
            System.out.println(a);
            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
