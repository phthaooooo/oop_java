import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

class SinhVien implements Comparable <SinhVien> {
    private static int id = 1;
    private String code, name, cl, dob;
    private double point;

    public SinhVien(String name, String cl, String dob, double point) {
        this.code = String.format("B20DCCN%03d", id++);
        this.name = reName(name);
        this.cl = cl;
        this.dob = dob;
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    private String reName(String name) {
        name = name.toLowerCase().trim();
        String[] words = name.split("\\s+");
        StringBuilder chuanHoa = new StringBuilder();
        for (String word : words) {
            chuanHoa.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return chuanHoa.toString().trim();
    }

    @Override
    public String toString() {
       // DecimalFormat df = new DecimalFormat("0.00");
        return code + " " + name + " " + cl + " " + dob + " " + String.format("%.2f", point);
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.getPoint(), this.getPoint());
    }



}

public class DanhSachDoiTuongSinhVien2 {
    public static void main(String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd/MM/yyyy");

        int N = Integer.parseInt(sc.nextLine());
        SinhVien[] danhSach = new SinhVien[N];

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine().trim();
            String cl = sc.nextLine().trim();
            String dob = sc.nextLine().trim();
            dob = sdfOutput.format(sdfInput.parse(dob)); // Chuẩn hóa ngày sinh
            double point = Double.parseDouble(sc.nextLine().trim());

            SinhVien s = new SinhVien(name, cl, dob, point);
            danhSach[i] = s;
        }
        Arrays.sort(danhSach);
        // In danh sách sinh viên
        for (SinhVien s : danhSach) {
            System.out.println(s);
        }

        sc.close();
    }
}
