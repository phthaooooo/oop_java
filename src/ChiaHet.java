import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("11");

            if (a.mod(b).toString().equals("0")) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}