package hopvagiaocuahaifilevanban;
import java.io.*;
import java.util.*;

public class WordSet {
    private Set<String> words;

    // Constructor: Đọc từ tệp và lưu các từ duy nhất
    public WordSet(String fileName) throws IOException {
        words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); // Sử dụng TreeSet để tự động sắp xếp
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split("\\s+"); // Tách các từ dựa trên khoảng trắng
            for (String token : tokens) {
                if (!token.isEmpty()) {
                    words.add(token.toLowerCase()); // Không phân biệt hoa thường
                }
            }
        }
        br.close();
    }

    // Phương thức union: Tính hợp của hai tập
    public WordSet union(WordSet other) {
        Set<String> result = new TreeSet<>(words);
        result.addAll(other.words); // Hợp các từ
        return new WordSet(result);
    }

    // Phương thức intersection: Tính giao của hai tập
    public WordSet intersection(WordSet other) {
        Set<String> result = new TreeSet<>(words);
        result.retainAll(other.words); // Giao các từ
        return new WordSet(result);
    }

    // Constructor hỗ trợ tạo từ Set (dùng cho union và intersection)
    private WordSet(Set<String> words) {
        this.words = words;
    }

    // Phương thức toString để hiển thị kết quả
    @Override
    public String toString() {
        return String.join(" ", words); // Nối các từ bằng khoảng trắng
    }

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}
