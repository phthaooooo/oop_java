import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class NhanVien implements Comparable<NhanVien>{
    private static int id = 1;
    private String code, name, sex, address, taxCode;
    Date dob, dateOfContract;
    public NhanVien(){}
    public NhanVien(String name, String sex, Date dob, String address, String taxCode, Date dateOfContract){
        this.code = String.format("000%02d", id++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.dateOfContract = dateOfContract;
    }
    public String formatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + sex + " " + formatDate(dob) + " " + address + " " + taxCode + " " + formatDate(dateOfContract);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.dob.compareTo(o.dob);
    }
}
public class DanhSachDoiTuongNhanVien {
    public static void main (String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int N = Integer.parseInt(sc.nextLine());
        List<NhanVien> nv = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            String sex = sc.nextLine();
            Date dob = sdf.parse(sc.nextLine());
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            Date dateOfContract = sdf.parse(sc.nextLine());
            nv.add(new NhanVien(name, sex, dob, address, taxCode, dateOfContract));
        }
        Collections.sort(nv);
        for (NhanVien v : nv){
            System.out.println(v);
        }
    }
}
