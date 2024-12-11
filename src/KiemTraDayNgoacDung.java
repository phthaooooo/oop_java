import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String input = sc.nextLine();
            //StringBuilder s = new StringBuilder(MUAHANG.in);
            Stack<Character> chars = new Stack<>();
            //chars.push('1');
           // s.deleteCharAt(0);
            int res = 0;
            int tmp = 0;
            for (Character i : input.toCharArray()) {

                if(i.equals('(') || i.equals('{') || i.equals('[')){
                    chars.push(i);

                } else {
                    if(!chars.isEmpty()){
                        if(chars.peek().equals('(') && i.equals(')')) {
                            chars.pop();
                            tmp += 2;

                        } else if (chars.peek().equals('{') && i.equals('}')) {
                            chars.pop();
                            tmp += 2;
                        } else if (chars.peek().equals('[') && i.equals(']')) {
                            chars.pop();
                            tmp += 2;
                        }
                        res = Math.max(res, tmp);
                    } else {
                        tmp = 0;
                        chars.push(i);
                        //break;
                    }

                }


            }
            System.out.println(res);

        }
    }
}
