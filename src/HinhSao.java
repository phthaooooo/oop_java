import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HinhSao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int N = T - 1;
        LinkedHashMap<Integer, Integer> countPoints = new LinkedHashMap<>();
        while (N-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            countPoints.put(a, countPoints.getOrDefault(a, 0) + 1);
            countPoints.put(b, countPoints.getOrDefault(b, 0) + 1);
        }
        int check = 0;
        Integer keyToRemove = null;
        for(Map.Entry<Integer, Integer> k : countPoints.entrySet()){
            // System.out.println(k.getKey() + " " + k.getValue());
            if(k.getValue() == T - 1){
                check = 1;
                keyToRemove = k.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            countPoints.remove(keyToRemove);
        }
        int check1 = 0;
        if (check == 1){
            for(Map.Entry<Integer, Integer> k : countPoints.entrySet()){
                // System.out.println(k.getKey() + " " + k.getValue());
                if(k.getValue() == 1){
                    check1 = 1;
                } else{
                    check1 = 0;
                    break;
                }
            }
        }
        if ( check == 1 && check1 == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
