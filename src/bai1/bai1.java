/*package bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private static int id = 1;
   private String code, name, donvi;
   private int giamua, giaban;
   public Product(String name, String donvi, int giamua, int giaban){
       this.code = String.format("MH%03d", id++);
       this.name = name;
       this.donvi = donvi;
       this.giamua = giamua;
       this.giaban = giaban;
   }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
class Customer {
    private static int id = 1;
    private String code, name, sex, dob, address;
    public Customer(String name, String sex, String dob, String address) {
        this.code = String.format("KH%03d", id++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
class HoaDon {
    private static int id = 1;
    private String code, maKH, maMH;
    private int soluong, tien, profit;
    public HoaDon( String maKH, String maMH, int soluong ){
        this.code = String.format("HD%03d", id++);
        this.maMH = maMH;
        this.maKH = maKH;
    }
    public String getCode() {
        return code;
    }
}
public class bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\codeptit_java\\OOP_CodePTIT\\src\\bai1\\MUAHANG.in"));
        int soKH = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        while (soKH-- >0) {
            String tenKH = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            customers.add(new Customer(tenKH, sex, dob, address));
        }
        List<Product> products = new ArrayList<>();
        int soMH = Integer.parseInt(sc.nextLine());
        while(soMH-- >0) {
            String tenMH = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            products.add(new Product(tenMH, donvi, giamua, giaban));
        }
        List<HoaDon> hoaDons = new ArrayList<>();
        int soHD = Integer.parseInt(sc.nextLine());

        while (soHD-- >0) {
            String[] b = sc.nextLine().split("\\s+");
            for (Customer i : customers) {
                if(i.getCode().equals(b[0])) {
                    for (Product j : products) {
                        if(j.getCode().equals(b[1])){
                            hoaDons.add(new HoaDon());
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
*/