import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class GhiFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        // Nhập dữ liệu
        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(sc.nextLine()));
        }

        try {
            // Ghi dữ liệu vào file bằng ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("D:\\codeptit_java\\OOP_CodePTIT\\src\\LopPair\\Input.in")
            );
            oos.writeObject(numbers); // Tuần tự hóa danh sách số nguyên
            oos.close();
            System.out.println("Ghi file thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
