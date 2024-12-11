package tinhtienphong;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int N = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine().trim();
            String roomID = sc.nextLine().trim();
            Date checkInDate = sdf.parse(sc.nextLine());
            Date checkOutDate = sdf.parse(sc.nextLine());
            int serviceFee = Integer.parseInt(sc.nextLine());
            customers.add(new Customer(name, roomID, checkInDate, checkOutDate, serviceFee));
        }
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o2.getTotalCost() - o1.getTotalCost();
            }
        });
        for (Customer i : customers){
            System.out.println(i);
        }
    }
}
