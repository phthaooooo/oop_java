package lopintset;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class LopINTSET {
 static class IntSet {
    private TreeSet<Integer> a1 = new TreeSet<>(); // Dùng TreeSet để tự động sắp xếp và loại bỏ phần tử trùng lặp.

    // Constructor mặc định
    public IntSet() {}

    // Constructor nhận vào một Set<Integer>
    public IntSet(TreeSet<Integer> a) {
       for (Integer i : a){
           a1.add(i);
       }
    }

    // Constructor nhận vào mảng int[] và chuyển nó thành Set<Integer>
    public IntSet(int[] a) {
        for (int i : a) {
            a1.add(i); // TreeSet tự động loại bỏ các phần tử trùng lặp
        }
    }

    // Phương thức trả về hợp của hai tập
    public IntSet union(IntSet s2) {
        // Tạo một Set mới từ a1 và thêm các phần tử của a2 vào
        TreeSet<Integer> b = new TreeSet<>();  // Tạo một TreeSet mới để chứa kết quả
        b.addAll(this.a1);  // Thêm tất cả các phần tử của tập hiện tại vào b
        b.addAll(s2.a1);  // Thêm tất cả các phần tử của tập đối tượng o vào b
        return new IntSet(b);
    }

    // Phương thức để in ra tập hợp
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Integer i : a1) {
            res.append(i).append(" ");
        }
        return res.toString().trim(); // Loại bỏ khoảng trắng thừa ở cuối
    }
}


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\codeptit_java\\OOP_CodePTIT\\src\\lopintset\\MUAHANG.in"));

        // Đọc kích thước các mảng
        int n = sc.nextInt(), m = sc.nextInt();

        // Khởi tạo các mảng a[] và b[]
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        // Tạo hai đối tượng IntSet từ hai mảng
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);

        // Thực hiện phép hợp và in kết quả
        IntSet result = s1.union(s2);
        System.out.println(result);
    }
}
