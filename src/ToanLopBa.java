import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ToanLopBa {
    private static boolean hasAnswer;
    private static String exp;
    private static char[] signs = {'+', '-'};
    private static boolean isValid(){
       int a = Integer.parseInt(exp.substring(0, 2));
       int b = Integer.parseInt(exp.substring(5, 7));
       int c = Integer.parseInt(exp.substring(10));
       if(exp.charAt(3) == '+') {
           return a + b == c;
       } else{
           return a - b == c;
       }
    }

    private static String changeChar(String src, int index, char expect){
        return src.substring(0, index) + expect + src.substring(index + 1);
    }
    private static void Try(int index) {
        if(hasAnswer) return;

        if(index == exp.length()) {
            if(isValid()) {
                hasAnswer = true;
                System.out.println(exp);
            }
            return;
        }

        if(exp.charAt(index) == '?') {
            if(index == 3) {
                for (int i = 0; i < 2; i++) {
                    exp = changeChar(exp, index, signs[i]);
                    Try(index + 1);
                }
            } else {
                for (int i = '0'; i <= '9'; i++) {
                    exp = changeChar(exp, index, (char) (i));
                    Try(index + 1);
                }
            }
            exp = changeChar(exp, index, '?');
        }
        else {Try(index + 1);}
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T-- >0) {
            exp = sc.nextLine();
            hasAnswer = false;
            Try(0);
        }
    }
}
