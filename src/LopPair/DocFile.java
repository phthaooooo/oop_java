package LopPair;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DocFile {
    public static void main(String[] args) throws EOFException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\LopPair\\Input.in"));
            ArrayList<Integer> numbers = (ArrayList<Integer>) ois.readObject();
            ois.close();

            System.out.println("Dữ liệu trong file:");
            for (int num : numbers) {
                System.out.println(num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
