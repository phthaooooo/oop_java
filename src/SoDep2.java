import java.util.Scanner;

public class SoDep2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T-- >0){
            String s = sc.nextLine();
            System.out.println(s.matches("[^014689]+") && isPalindrome(s) ? "YES" : "NO");

        }
    }
    private static boolean isPalindrome(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
