import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file DAYSO.in
            BufferedReader br = new BufferedReader(new FileReader("DAYSO.in"));
            int N = Integer.parseInt(br.readLine().trim());

            // Khởi tạo danh sách để lưu các số
            List<BigInteger> numbers = new ArrayList<>();

            // Đọc các số từ file
            for (int i = 0; i < N; i++) {
                BigInteger number = new BigInteger(br.readLine().trim());
                numbers.add(number);
            }
            br.close();

            // Tìm số nhỏ nhất, số lớn nhất và tính tổng
            BigInteger min = numbers.get(0);
            BigInteger max = numbers.get(0);
            BigInteger sum = BigInteger.ZERO;

            for (BigInteger number : numbers) {
                if (number.compareTo(min) < 0) {
                    min = number;
                }
                if (number.compareTo(max) > 0) {
                    max = number;
                }
                sum = sum.add(number);
            }


            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
