package tongdathuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class draft {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\codeptit_java\\OOP_CodePTIT\\src\\tongdathuc\\MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
            for (heso_somu i : p.list) {
                System.out.println(i.getHeso() + " " + i.getSomu());
            }
        }
    }
}
