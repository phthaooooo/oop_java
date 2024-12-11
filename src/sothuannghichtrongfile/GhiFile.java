package sothuannghichtrongfile;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GhiFile {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\sothuannghichtrongfile\\DATA1.in"));
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\sothuannghichtrongfile\\DATA2.in"));
        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            input1.add(939);
            input1.add(11311);
        }
        oos.writeObject(input1);
        input2.add(939);
        for (int i = 0; i < 6 ; i++) {
            input2.add(11311);
        }
        oos1.writeObject(input2);
    }
}
