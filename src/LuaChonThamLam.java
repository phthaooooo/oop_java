import java.util.Scanner;

public class LuaChonThamLam {
    private static String getMaxNumber (int N, int S){
        StringBuilder maxNumber = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (S > 9){
                maxNumber.append("9");
                S -= 9;
            } else{
                maxNumber.append((char) (S + '0'));
                S = 0;
            }
        }
        return maxNumber.toString();
    }
    private static String getMinNumber (int N, int S){
        StringBuilder minNumber = new StringBuilder();
        int tmp = S - 9 * (N - 1);
        if (tmp < 0) {
            tmp = 1;
        }
        minNumber.append((char) (tmp + '0'));
        S = S - tmp;
        for (int i = 1; i < N; i++) {
            tmp = S - 9 * (N - 1 - i);
            if(tmp < 0) {
                tmp = 0;
            }
            minNumber.append((char) (tmp + '0'));
            S -= tmp;
        }
        return minNumber.toString();
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        if (S == 0 && N > 1){
            System.out.println("-1 -1");
        } else if (S > 9 * N) {
            System.out.println("-1 -1");
        }
        else{
            System.out.println(getMinNumber(N, S) + " " + getMaxNumber(N, S));
        }

    }
}
