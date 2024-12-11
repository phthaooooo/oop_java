import java.util.*;

public class DayConCoTongNguyenTo {
    private static boolean isPrime(List<Integer> b){
        int sum = 0;
        for (Integer i : b){
            sum += i;
        }
        if(sum < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sum); i++){
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }
    static List<List<Integer>> res = new ArrayList<>();
    private static void backTracking(List<Integer> input, List<Integer> current, int index) {
        if(!current.isEmpty() && isPrime(current)){

            res.add(new ArrayList<>(current));
        }
        for (int i = index; i < input.size(); i++) {
            current.add(input.get(i));
            backTracking(input, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- >0){
            int N = sc.nextInt();
            sc.nextLine();
            String[] input = sc.nextLine().split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                a.add(Integer.parseInt(input[i]));
            }
            Collections.sort(a, Collections.reverseOrder());
            res.clear();
            backTracking(a, new ArrayList<>(), 0);
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
            for (List<Integer> i : res){
                for (int k : i){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }



}
