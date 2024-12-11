import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine().replaceFirst("^0+", "");
        String b1 = sc.nextLine().replaceFirst("^0+", "");
        if(a1.isEmpty()){
            a1 = "0";
        }
        if(b1.isEmpty()){
            b1 = "0";
        }

        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(b1);

        BigInteger res = a.add(b);

        System.out.println(res.toString());
    }
}
