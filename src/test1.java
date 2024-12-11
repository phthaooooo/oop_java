import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            String[] input = sc.nextLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            String[] line1 = sc.nextLine().split("\\s+");
            String[] line2 = sc.nextLine().split("\\s+");
            List<Integer> a1 = new ArrayList<>();
            List<Integer> a2 = new ArrayList<>();
            for(int i = 0; i < line1.length; i++){
                a1.add(Integer.parseInt(line1[i]));

            }
            for (int i = 0; i < line2.length; i++) {
                a2.add(Integer.parseInt(line2[i]));
            }
            if(a1.containsAll(a2)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
