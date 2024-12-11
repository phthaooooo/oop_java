import java.util.ArrayList;
import java.util.Scanner;

public class ChuanHoaXauHoTen2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while (N-- >0){
            String input = sc.nextLine().toLowerCase().trim();
            String[] names = input.split("\\s+");

            for (int i = 0; i < names.length; i++) {
                names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
            }
            String lastname = names[0].toUpperCase();
            StringBuilder fullName = new StringBuilder();
            for (int j = 1; j < names.length; j++){
                fullName.append(names[j]).append(" ");
            }

            fullName.setLength(fullName.length() - 1);
            fullName.append(", ").append(lastname);
            name.add(fullName.toString());
        }
        for (String n : name){
            System.out.println(n);
        }
    }
}
