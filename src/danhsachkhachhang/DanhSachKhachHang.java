package danhsachkhachhang;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Customer {
    private static int id = 1;
    private String code, name, sex, dob, address;
    private Date dobDate;  // Biến lưu trữ ngày sinh dưới dạng Date

    public Customer(String name, String sex, String dob, String address) throws ParseException {
        this.code = String.format("KH%03d", id++);
        this.name = reName(name);
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        // Chuyển đổi chuỗi dob thành đối tượng Date để dễ dàng so sánh
        this.dobDate = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    public String getDob() {
        return dob;
    }

    public Date getDobDate() {
        return dobDate;
    }

    public String reName(String name) {
        name = name.toLowerCase().trim();
        String[] name1 = name.split("\\s+");
        StringBuilder formatName = new StringBuilder();
        for (String i : name1) {
            formatName.append(Character.toUpperCase(i.charAt(0)))
                    .append(i.substring(1))
                    .append(" ");
        }
        return formatName.toString().trim();
    }

    @Override
    public String toString() {
        return code + " " + name + " " + sex + " " + address + " " + dob;
    }
}

public class DanhSachKhachHang {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdfinput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfoutput = new SimpleDateFormat("dd/MM/yyyy");
        int T = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();

        while (T-- > 0) {
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            dob = sdfoutput.format(sdfinput.parse(dob));  // Đảm bảo định dạng ngày chính xác
            String address = sc.nextLine();
            customers.add(new Customer(name, sex, dob, address));
        }

        // Sắp xếp khách hàng theo ngày sinh từ lớn tuổi đến trẻ tuổi (người sinh trước sẽ được xếp trước)
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                // So sánh theo Date (người sinh cũ nhất sẽ xếp trước)
                return o1.getDobDate().compareTo(o2.getDobDate());
            }
        });

        // In danh sách khách hàng đã sắp xếp
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
