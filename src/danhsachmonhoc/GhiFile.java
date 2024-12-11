package danhsachmonhoc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhiFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\danhsachmonhoc\\MONHOC.in"));
        List<Subject> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String codeSubject = sc.nextLine();
            String name = sc.nextLine();
            int amount = Integer.parseInt(sc.nextLine());
            Subject a = new Subject(codeSubject, name, amount);
            list.add(a);
        }

        oos.writeObject(list);
        sc.close();

        oos.close();
    }
}
