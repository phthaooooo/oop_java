package danhsachsinhvientrongfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien2  {
    private static int id = 1;
    private String code, name, cl, dob;
    private double point;

    public SinhVien2(String name, String cl, String dob, double point){
        this.code = String.format("B20DCCN%03d", id++);
        this.name = name;
        this.cl = cl;
        this.dob = dob;
        this.point = point;
    }
    @Override
    public String toString(){
        return code + " " + name + " " + cl + " " + dob + " " + String.format("%.2f", point);
    }
}

public class DanhSachSinhVienTrongFile2 {
    public static void main (String[] args) throws FileNotFoundException, IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd/MM/yyyy");
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++){
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String dob = sc.nextLine();
            dob = sdfOutput.format(sdfInput.parse(dob));
            Double point = Double.parseDouble(sc.nextLine());
            SinhVien2 s = new SinhVien2(name, cl, dob, point);
            System.out.println(s);
        }



    }
}
