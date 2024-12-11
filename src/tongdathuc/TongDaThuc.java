package tongdathuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class heso_somu {
    public int heso, somu;
    public heso_somu(int heso, int somu) {
        this.heso = heso;
        this.somu = somu;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public int getSomu() {
        return somu;
    }

    public void setSomu(int somu) {
        this.somu = somu;
    }
}

class DaThuc {

    public String dathuc;
    public List<heso_somu> list = new ArrayList<>();

    public DaThuc(){}

    public DaThuc(String dathuc) {
        this.dathuc = dathuc;
        genHSSM();
    }
    // xử lý dấu *, ^, +
    public void genHSSM() {
        String[] tmp = dathuc.split(" ");
        List<String> l = new ArrayList<>();
        for (String i : tmp) {
            if(!i.equals("+")){
                l.add(i);
            }
        }
        for (String i : l) {
            String[] parts = i.split("\\*|\\^");
            int hs = Integer.parseInt(parts[0]);
            int somu = Integer.parseInt(parts[2]);
            list.add(new heso_somu(hs, somu));
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(); // Sử dụng StringBuilder để nối chuỗi hiệu quả hơn
        for (heso_somu i : list) {
            res.append(i.getHeso()).append("*x^").append(i.getSomu()).append(" + ");
        }
        // Xóa phần "+ " thừa ở cuối chuỗi nếu có
        if (res.length() > 0) {
            res.delete(res.length() - 2, res.length());
        }
        return res.toString();
    }

    public DaThuc cong(DaThuc q) {
        Map<Integer, Integer> resultMap = new TreeMap<>(Collections.reverseOrder()); // TreeMap để sắp xếp theo bậc giảm dần

        // Thêm phần tử của đa thức đầu tiên vào resultMap
        for (heso_somu hs : this.list) {
            resultMap.put(hs.getSomu(), resultMap.getOrDefault(hs.getSomu(), 0) + hs.getHeso());
        }

        // Thêm phần tử của đa thức thứ hai vào resultMap
        for (heso_somu hs : q.list) {
            resultMap.put(hs.getSomu(), resultMap.getOrDefault(hs.getSomu(), 0) + hs.getHeso());
        }

        // Tạo một DaThuc mới để chứa kết quả
        DaThuc result = new DaThuc();

        // Chuyển kết quả vào list của DaThuc mới
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            result.list.add(new heso_somu(entry.getValue(), entry.getKey()));
        }

        return result;
    }
}

public class TongDaThuc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
