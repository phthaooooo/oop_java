import java.util.Scanner;

public class XauConLonNhat {

    private static int findMax(StringBuilder s){
        char maxChar = s.charAt(0);
        int maxIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar > maxChar){
                maxChar = currentChar;
                maxIndex = i;

            }
        }
        return maxIndex;
    }

    private static String solution(StringBuilder input){
        StringBuilder res = new StringBuilder("");

        while (input.length() > 0) {
            int maxIndexs = findMax(input);
            res.append(input.charAt(findMax(input)));
            input.delete(0, maxIndexs + 1);
        }
        return res.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        System.out.println(solution(input));
    }
}
