import java.util.*;
import java.io.*;

public class KhoangCachNhoHonK {
    static long countPairs(int[] arr, int n, int k) {
        // Sắp xếp mảng tăng dần
        Arrays.sort(arr);

        long count = 0;
        // Với mỗi phần tử, tìm các phần tử có hiệu < k
        for (int i = 0; i < n; i++) {
            // Tìm vị trí j sao cho arr[j] - arr[i] < k
            // sử dụng binary search để tối ưu
            int left = i + 1;
            int right = n - 1;
            int pos = i;  // vị trí cuối cùng thỏa mãn

            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] - arr[i] < k) {
                    pos = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // Cộng thêm số cặp tìm được
            if (pos > i) {
                count += pos - i;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            String[] line = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);

            line = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            System.out.println(countPairs(arr, n, k));
        }
    }
}