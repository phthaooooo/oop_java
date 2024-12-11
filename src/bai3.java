import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bai3 {
    static class SinhVien{
        String msv, name, class1, e, num;
        public SinhVien(String msv, String name, String class1, String e, String num){
            this.msv = msv;
            this.name = name;
            this.class1 = class1;
            this.e = e;
            this.num = num;
        }
        public void output(){
            System.out.printf("%s %s %s %s 0%s\n", msv, name, class1, e, num);
        }

    }
    public static void main(String args[]) throws FileNotFoundException {
        File file1 = new File("DANHSACH.in");
        Scanner sc = new Scanner(file1);
        List<SinhVien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv, (m, n) -> m.msv.compareTo(n.msv));
        Collections.sort(sv, (m, n) -> m.class1.compareTo(n.class1));
        for(SinhVien i : sv){
            i.output();
        }
    }
}
