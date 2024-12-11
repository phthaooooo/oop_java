import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SV implements Comparable<SV> {
    public static int id = 1;
    private String code, name, cLass, dob;
    private float gpa;

    public SV(String name, String cLass, String dob, float gpa) {
        this.code = String.format("B20DCCN%03d", id++);
        this.name = formatName(name);
        this.cLass = cLass;
        this.dob = formatDate(dob);
        this.gpa = gpa;
    }

    public Float getGpa() {
        return gpa;
    }

    private String formatDate(String s) {
        String[] str = s.split("/");
        StringBuilder res = new StringBuilder();
        for (String i : str) {
            if (i.length() == 1) {
                i = "0" + i;
            }
            res.append(i).append("/");
        }
        return res.substring(0, res.length() - 1);
    }

    private String formatName(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String i : str) {
            res.append(i.substring(0, 1).toUpperCase())
                    .append(i.substring(1).toLowerCase()).append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public int compareTo(SV o) {
        return -(this.getGpa().compareTo(o.getGpa()));
    }

    @Override
    public String toString() {
        return code + " " + name + " " + cLass + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class DanhSachDoiTuongSinhVien3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Đọc số sinh viên và bỏ qua dòng trống

        List<SV> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            String name = sc.nextLine();
            String cLass = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = sc.nextFloat();

            SV a = new SV(name, cLass, dob, gpa);
            list.add(a);
        }

        Collections.sort(list);
        for (SV k : list) {
            System.out.println(k);
        }

        sc.close();
    }
}
