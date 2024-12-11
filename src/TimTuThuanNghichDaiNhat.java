import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> allWords = new ArrayList<>();

        // Đọc tất cả các dòng và gom các từ
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break; // Dừng nếu gặp dòng trống
            String[] words = line.split("\\s+");
            for (String word : words) {
                allWords.add(word);
            }
        }

        // Tìm từ thuận nghịch có độ dài lớn nhất
        int maxLength = 0;
        LinkedHashMap<String, Integer> palindromeCounts = new LinkedHashMap<>();

        for (String word : allWords) {
            if (isPalindrome(word)) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    palindromeCounts.clear();
                    palindromeCounts.put(word, 1);
                } else if (word.length() == maxLength) {
                    palindromeCounts.put(word, palindromeCounts.getOrDefault(word, 0) + 1);
                }
            }
        }

        // In kết quả
        for (Map.Entry<String, Integer> entry : palindromeCounts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }

    // Phương thức kiểm tra từ có phải là thuận nghịch hay không
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
