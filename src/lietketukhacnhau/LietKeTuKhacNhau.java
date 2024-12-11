package lietketukhacnhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new TreeSet<>();
        while (sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
        for(String i : set){
            System.out.println(i);
        }
    }
}
