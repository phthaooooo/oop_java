import java.util.ArrayList;
import java.util.Scanner;

public class GuiThongBao {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String line = sc.nextLine().trim();
            String res = "";
            String[] tu = line.split("\\s+");
            ArrayList<String> a = new ArrayList<>();
            int count = 0;
            for(int i = 0; i < tu.length; i++) {
                if(count + tu[i].length() < 100){
                    count += tu[i].length();
                    a.add(tu[i]);
                }
                count++;
            }
            for(String v : a){
                res = res + v + " ";
            }
            System.out.println(res);
        }
    }
}
