import java.util.*;

public class DayConCoTongLe {
    private static boolean sumOfDigits(List<Integer> subset){
        int sum = 0;
        for (int num : subset){
            sum += num;
        }
        return sum % 2 != 0;
    }

    static List<List<Integer>> res = new ArrayList<>();
    private static void backTracking(List<Integer> input, List<Integer> current, int index){
        if(!current.isEmpty() && sumOfDigits(current)){
            res.add(new ArrayList<>(current));
        }
        for (int i = index; i < input.size(); i++) {
            current.add(input.get(i));
            backTracking(input, current, i + 1);
            current.remove(current.size() - 1);
        }
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            List<Integer> input = new ArrayList<>();
            for (int num : arr){
                input.add(num);
            }
            Collections.sort(input, Collections.reverseOrder());
            res.clear();
            backTracking(input, new ArrayList<>(), 0);
            Collections.sort(res, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    int len = Math.min(o1.size(), o2.size());
                    for (int i = 0; i < len; i++) {
                        if(!o1.get(i).equals(o2.get(i))){
                            return o1.get(i) - o2.get(i);
                        }
                    }
                    return o1.size() - o2.size();
                }
            });
            for (List<Integer> subset : res){
                for (int num : subset){
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        }
    }
}
