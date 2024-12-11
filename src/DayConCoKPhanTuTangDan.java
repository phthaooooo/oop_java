import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DayConCoKPhanTuTangDan {
    static List<List<Integer>> res = new ArrayList<>();
    private static void backTracking(List<Integer> input, List<Integer> current, int index, int K){
        if (current.size() == K){
            res.add(new ArrayList<>(current));
        }
        for (int i = index; i < input.size(); i++) {
            current.add(input.get(i));
            backTracking(input, current, i + 1, K);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- >0){
            String[] in = sc.nextLine().split(" ");
            int N = Integer.parseInt(in[0]);
            int K = Integer.parseInt(in[1]);
            List<Integer> input = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                input.add(sc.nextInt());

            }
            sc.nextLine();
            Collections.sort(input);
            res.clear();
            backTracking(input, new ArrayList<>(), 0, K);
            for (List<Integer> l : res){
                for (int i : l){
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }
    }
}
