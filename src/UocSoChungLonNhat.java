import java.util.List;
import java.util.Scanner;

public class UocSoChungLonNhat {
    private static int GCD (int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
    static int lcm(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng test cases
        int T = sc.nextInt();

        while (T-- > 0) {
            // Đọc số phần tử N của dãy A
            int N = sc.nextInt();

            // Đọc dãy A
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Tạo dãy B thỏa mãn điều kiện gcd(B[i], B[i+1]) = A[i]
            int[] B = new int[N + 1];

            // Với test case đầu tiên [5, 10, 5], kết quả là [5, 10, 10, 5]
            // Ta thấy rằng:
            // - B[i] và B[i+1] phải có GCD = A[i]
            // - Nếu A[i] là ước của A[i+1], ta có thể dùng A[i+1] cho B[i+1]

            B[0] = A[0];  // Phần tử đầu tiên
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    // Với phần tử đầu tiên, ta lấy bội chung nhỏ nhất của A[0] và A[1]
                    B[1] = lcm(A[0], A[1]);
                } else {
                    // Với các phần tử còn lại
                    B[i+1] = lcm(B[i], A[i]);
                }
            }

            // In kết quả
            for (int i = 0; i <= N; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
        }
    }
}
