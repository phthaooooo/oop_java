

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.add(b);

            StringBuilder sb = new StringBuilder(c.toString());
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
}