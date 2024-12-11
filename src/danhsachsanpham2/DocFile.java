/*import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.File;

class Product{
    private String code, name;
    private int price, month;
    public Product (String code, String name, int price, int month) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public int getPrice() {
        return price;
    }
    public String getCode(){
        return code;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + price + " " + month;
    }
}

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int warrantyPeriod = Integer.parseInt(sc.nextLine());
            products.add(new Product(id, name, price, warrantyPeriod));
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() == o2.getPrice()){
                    return o1.getCode().compareTo(o2.getCode());
                }
                else {
                    return o2.getPrice() - o1.getPrice();
                }
            }
        });
        for (Product item : products) {
            System.out.println(item);
        }
    }
}*/