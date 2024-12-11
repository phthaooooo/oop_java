import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoaiBoSoNguyen {

    private static boolean isInteger (String s) throws FileNotFoundException{
        if(!s.matches("-?\\d+")) return false;
        try {
            BigInteger num = new BigInteger(s);
            return num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >=0 &&
                    num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0;
        } catch (Exception e) {
            return false;
        }
    }

    private static String loaiBo (String input) {
        String[] words = input.split("\\s+");
        StringBuilder s = new StringBuilder();
        for (String i : words) {
            if(!isInteger(i)) {
                s.append(i).append(" ");
            }
        }
        return s.toString().trim();
    }

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> res = new ArrayList<>();
        while(sc.hasNext()) {
            res.add(loaiBo(sc.next()));
        }
        Collections.sort(res);
        for (String i : res) {
            if(!i.isEmpty()){
                System.out.print(i + " ");
            }
        }
    }
}
