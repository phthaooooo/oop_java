package xulyvanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuLyVanBan {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        List<String> res_final = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        while (sc.hasNext()){
            tmp.append(sc.nextLine().replaceAll("\\s+", " "));
        }
        String[] res = tmp.toString().toLowerCase().split("[.!?]");
        for (String i : res) {
            i = i.trim();
            StringBuilder tmp1 = new StringBuilder();
            tmp1.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1));
            res_final.add(tmp1.toString());
        }
        for (String i : res_final){
            System.out.println(i);
        }

    }
}
