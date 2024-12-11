import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<String> emails = new ArrayList<>();
        Map<String, Integer> emailCount = new HashMap<>();

        while (N-- > 0) {
            String line = sc.nextLine().toLowerCase().trim();
            String[] names = line.split("\\s+");

            // Tạo phần chính của địa chỉ email
            StringBuilder email = new StringBuilder();
            email.append(names[names.length - 1]); // Tên
            for (int i = 0; i < names.length - 1; i++) {
                email.append(names[i].charAt(0)); // Chữ cái đầu của họ và tên đệm
            }
            String emailBase = email.toString();

            // Kiểm tra sự trùng lặp và thêm số thứ tự nếu cần
            if (emailCount.containsKey(emailBase)) {
                int count = emailCount.get(emailBase) + 1;
                emailCount.put(emailBase, count);
                email.append(count);
            } else {
                emailCount.put(emailBase, 1);
            }

            email.append("@ptit.edu.vn");
            emails.add(email.toString());
        }

        // In kết quả
        for (String e : emails) {
            System.out.println(e);
        }
    }
}
