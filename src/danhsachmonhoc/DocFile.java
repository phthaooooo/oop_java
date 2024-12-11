package danhsachmonhoc;
import java.io.Serializable;
import java.io.*;
import java.util.*;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, StreamCorruptedException, EOFException, InvalidClassException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MONHOC.in"));

        List<Subject> a = (ArrayList<Subject>) ois.readObject();
        Collections.sort(a, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Subject i : a){
            System.out.println(i);
        }
        ois.close();
    }
}
