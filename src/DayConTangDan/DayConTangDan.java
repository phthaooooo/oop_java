package DayConTangDan;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DayConTangDan {
    static List<List<String>> res = new ArrayList<>();
    private static void solution(List<Integer> inputs, List<String> current, int index){
        if(current.size() >= 2){
            res.add(new ArrayList<>(current));
        }
        for (int i = index; i < inputs.size(); i++) {
            if(current.isEmpty() || inputs.get(i) > Integer.parseInt(current.get(current.size() - 1))){
                current.add(String.valueOf(inputs.get(i)));
                solution(inputs, current, i + 1);
                current.remove(current.size() - 1);
            }


        }
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            a.add(Integer.parseInt(input[i]));
        }

        res.clear();
        solution(a, new ArrayList<String>(), 0);
        Collections.sort(res, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                int minLength = Math.min(o1.size(), o2.size());
                for (int i = 0; i < minLength; i++) {
                    int cmp = o1.get(i).compareTo(o2.get(i));
                    if(cmp != 0){
                        return cmp;
                    }
                }
                return Integer.compare(o1.size(), o2.size());
            }
        });
        for (List<String> l : res){
            for (String i : l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
