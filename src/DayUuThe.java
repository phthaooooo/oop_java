import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayUuThe {

    private static int countEven(List<Integer> a){
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) % 2 == 0){
                dem += 1;
            }
        }
        return dem;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- >0){
            List<Integer> input = new ArrayList<>();
            String s = sc.nextLine();
            String a[] = s.split(" ");
            for (int i = 0; i < a.length; i++) {
                input.add(Integer.parseInt(a[i]));
            }
            int k = countEven(input);
            if(input.size() % 2 == 0 && k > input.size() - k){
                System.out.println("YES");
            } else if (input.size() % 2 != 0 && k < input.size() - k) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
