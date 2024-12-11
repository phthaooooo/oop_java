/*package danhsachsanpham2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhiFile {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\danhsachsanpham2\\SANPHAM.in"));
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int month = Integer.parseInt(sc.nextLine());
            products.add(new Product(code, name, price, month));
        }
        oos.writeObject(products);
        oos.close();
    }
}
*/