import java.util.*;
import java.io.*;

public class DayConLienTiepTongBangK {
    static String findSubarrayWithSum(long[] arr, int n, long k) {
        // Nếu k = 0, kiểm tra xem có phần tử 0 không
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) return "YES";
            }
            return "NO";
        }

        int left = 0;
        long currentSum = 0;

        // Duyệt qua mảng với sliding window
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            // Thu nhỏ cửa sổ khi tổng lớn hơn k
            while (currentSum > k && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            // Kiểm tra nếu tìm thấy dãy con có tổng bằng k
            if (currentSum == k) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args)  {
        Scanner br = new Scanner(System.in);
        int T = Integer.parseInt(br.nextLine().trim());

        while (T-- > 0) {

            String[] line = br.nextLine().trim().split("\\s+");
            int N = Integer.parseInt(line[0]);
            long K = Long.parseLong(line[1]);


            line = br.nextLine().trim().split("\\s+");
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(line[i]);
            }


            System.out.println(findSubarrayWithSum(arr, N, K));
        }
    }
}