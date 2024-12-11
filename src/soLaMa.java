import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class soLaMa {
    private static int romanToDecimal(String roman) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int total = 0;
        int preValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {

            char currentChar = roman.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // Nếu giá trị hiện tại nhỏ hơn giá trị trước đó thì trừ, nếu không thì cộng
            if (currentValue < preValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            preValue = currentValue;
        }

        return total;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- >0){
            String line = sc.nextLine();
            System.out.println(romanToDecimal(line));
        }
    }
}
