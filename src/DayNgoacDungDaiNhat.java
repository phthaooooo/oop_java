import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- >0) {
            String s = sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int maxL = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        maxL = Math.max(maxL, i - stack.peek());
                    } else {
                        stack.push(i);
                    }
                }
            }
            System.out.println(maxL);
        }
    }
}
