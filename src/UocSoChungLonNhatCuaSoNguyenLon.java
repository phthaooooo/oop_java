import java.math.BigInteger;
import java.util.Scanner;

public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- >0){
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());

            BigInteger res = (a.subtract(b));

            System.out.println(res.abs());
        }
    }
}
