package quanlybanhang1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

class Customer{
    private static int id = 1;
    private String code, name, sex, dob, address;
    public Customer(String name, String sex, String dob, String address){
        this.code = String.format("KH%03d", id++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDob() {
        SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
        return F.format(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Product{
    private static int id = 1;
    private String codeP, nameP, donvi;
    private int giamua, giaban;
    public Product(String nameP, String donvi, int giamua, int giaban){
        this.codeP = String.format("MH%03d", id++);
        this.nameP = nameP;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }
}

class Bill {
    private static int id = 1;
    private String codeB, codeC, nameC, codeP, address, nameP, donvi;
    private int giamua, giaban, soluong, total;
    public Bill(String codeC, String codeP, int soluong) {
        this.codeB = String.format("HD%03d", id++);
        this.codeC = codeC;
        this.codeP = codeP;
        this.soluong = soluong;
    }

    public String getCodeB() {
        return codeB;
    }

    public void setCodeB(String codeB) {
        this.codeB = codeB;
    }

    public String getCodeC() {
        return codeC;
    }

    public void setCodeC(String codeC) {
        this.codeC = codeC;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameP() {
        return nameP;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }
    public long getTotal(){
        return getGiaban() * soluong ;
    }
    public long getProfit(){
        return getGiaban() * soluong - (getGiamua() * soluong);
    }
    @Override
    public String toString(){
        return this.codeB + " " + nameC + " " + address + " " + nameP + " " + soluong + " " + getTotal() + " " + getProfit();
    }
}
public class QuanLyBanHang1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int soKH = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        while(soKH-- >0) {
            customers.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int soMH = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        while (soMH-- >0) {
            products.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int soHD = Integer.parseInt(sc.nextLine());
        List<Bill> bills = new ArrayList<>();
        while (soHD-- >0) {
            String[] temp = sc.nextLine().split(" ");
            bills.add(new Bill(temp[0], temp[1], Integer.parseInt(temp[2])));
        }
        for (Bill b : bills){
            for (Customer c : customers) {
                if(b.getCodeC().equals(c.getCode())){
                    b.setNameC(c.getName());
                    b.setAddress(c.getAddress());
                }
            }
            for (Product p : products){
                if(b.getCodeP().equals(p.getCodeP())){
                    b.setNameP(p.getNameP());
                    b.setDonvi(p.getDonvi());
                    b.setGiamua(p.getGiamua());
                    b.setGiaban(p.getGiaban());
                }
            }
        }
        Collections.sort(bills, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return Long.compare(o2.getProfit(), o1.getProfit());
            }
        });
        for (Bill b : bills){
            System.out.println(b);
        }
    }
}
