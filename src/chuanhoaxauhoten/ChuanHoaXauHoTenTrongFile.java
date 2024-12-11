package chuanhoaxauhoten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {

    private static String chuanHoa (String s) {
        s = s.toLowerCase().trim();
        String[] words = s.split("\\s+");
        StringBuilder name = new StringBuilder();
        for (String word : words) {
            name.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return name.toString();
    }

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> res = new ArrayList<>();
        while(sc.hasNext()) {
            String s1 = sc.nextLine();
            if(s1.equals("END")) break;
            else {

                res.add(chuanHoa(s1));
            }
        }
        for (String i : res){
            System.out.println(i);
        }
    }
}
