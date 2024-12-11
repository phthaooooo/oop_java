package tinhngayhethanbaohanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TinhNgayHetHanBaoHanh {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int pr =Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        while (pr-- >0) {
            products.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int cus = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        while (cus-- >0) {
            customers.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        List<MuaHang> muaHangList = new ArrayList<>();
        for (Customer c : customers) {
            for (Product p : products) {
                if(c.getCodeP().equals(p.getCode())) {
                    muaHangList.add(new MuaHang(p, c));
                }
            }
        }
        Collections.sort(muaHangList, new Comparator<MuaHang>() {
            @Override
            public int compare(MuaHang o1, MuaHang o2) {
                if(o1.getNgayHetHan().equals(o2.getNgayHetHan())){
                    return o1.getCodeC().compareTo(o2.getCodeC());
                } else {
                    return o1.getNgayHetHan().compareTo(o2.getNgayHetHan());
                }
            }
        });
        for (MuaHang i : muaHangList) {
            System.out.println(i);
        }
    }
}
