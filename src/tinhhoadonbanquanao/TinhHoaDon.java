package tinhhoadonbanquanao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Product {
    private String codeP, nameP;
    private long price1, price2;
    public Product(String codeP, String nameP, long price1, long price2) {
        this.codeP = codeP;
        this.nameP = nameP;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public long getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }

    public long getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }
}

class Bill {
    private static int id = 1;
    private String codeB, nameP, codeTemp;
    private int amount;
    private long price1, price2;
    public Bill(String codeB, int amount) {
        this.codeB = codeB;
        this.amount = amount;
        this.codeTemp = String.format("%03d", id++);
    }



    public void setCodeTemp(String codeTemp) {
        this.codeTemp = codeTemp;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public int getAmount() {
        return amount;
    }

    public String getCodeB() {
        return codeB;
    }

    public void setCodeB(String codeB) {
        this.codeB = codeB;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice1() {
        return price1;
    }

    public void setPrice1(long price1) {
        this.price1 = price1;
    }

    public long getPrice2() {
        return price2;
    }

    public void setPrice2(long price2) {
        this.price2 = price2;
    }
    public double getPercent(){
        double percent = 0.0;
        if(getAmount() >= 150) {
            percent = 50.0/100.0;
        } else if (getAmount() >= 100) {
            percent = 30.0/100.0;
        } else if (getAmount() >= 50) {
            percent = 15.0/100.0;
        }
        return percent;
    }
    public double getTotal() {
        double total = 0.0;
        if(codeB.charAt(2) == '1') {
            total = getPrice1() * 1.0 * getAmount();

        } else if (codeB.charAt(2) == '2') {
            total = getPrice2() * 1.0 * getAmount();

        }
        return total;
    }
    public double getTotalAfterSale(){
        double res = 0.0;

        double sale;

        if(codeB.charAt(2) == '1') {

            sale = getPercent() * getTotal();
            res = getTotal() - sale;
        } else if (codeB.charAt(2) == '2') {
            sale = getPercent() *  getTotal();
            res = getTotal() - sale;
        }
        return res;
    }
    public double getsalePrice(){
        return getPercent() * getTotal();
    }
    @Override
    public String toString(){
        return codeB + "-" + this.codeTemp + " " + getNameP() + " " + (long)getsalePrice() + " " + (long)getTotalAfterSale();
    }
}

public class TinhHoaDon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        while(T-- >0) {
            String codeP = sc.nextLine();
            String nameP = sc.nextLine();
            long price1 = Long.parseLong(sc.nextLine());
            long price2 = Long.parseLong(sc.nextLine());
            products.add(new Product(codeP, nameP, price1, price2));
        }
        int N = Integer.parseInt(sc.nextLine());
        List<Bill> bills = new ArrayList<>();
        while (N-- >0) {
            String[] a = sc.nextLine().split(" ");
            bills.add(new Bill(a[0], Integer.parseInt(a[1])));
        }
        for (Bill b : bills) {
            String tmpCode = b.getCodeB().substring(0,2);
            String type = b.getCodeB().substring(2);
            for (Product p : products) {
                if(tmpCode.equals(p.getCodeP())){
                    b.setCodeB(tmpCode + type);
                    b.setNameP(p.getNameP());
                    b.setPrice1(p.getPrice1());
                    b.setPrice2(p.getPrice2());
                }
            }
        }
        Collections.sort(bills, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return Double.compare(o2.getTotalAfterSale(), o1.getTotalAfterSale());
            }
        });
        for (Bill b : bills){
            System.out.println(b);
        }
    }
}
