package sothuannghichtrongfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static void main (String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, EOFException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\sothuannghichtrongfile\\DATA1.in"));
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\sothuannghichtrongfile\\DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        System.out.println(a);
        System.out.println(a1);
        ois.close();
    }
}
