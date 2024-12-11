import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

class MatHang implements Comparable<MatHang>{
    private static int code = 1;
    private String id, name, donvi;
    private int buy, sell, profit;
    public MatHang(){

    }
    public MatHang(String name,String donvi, int buy, int sell){
        this.id = String.format("MH%03d", code++);
        this.name = name;
        this.donvi = donvi;
        this.sell = sell;
        this.buy = buy;
        profit = sell - buy;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + donvi + " " + buy + " " + sell + " " + profit;
    }
    @Override
    public int compareTo (MatHang o){
        return o.getProfit() - this.profit;
    }
}

public class DanhSachMatHang {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>(n);
        for (int i = 0; i < n ; i++){
            String name = sc.nextLine();
            String donvi = sc.nextLine();
            int buy = Integer.parseInt(sc.nextLine());
            int sell = Integer.parseInt(sc.nextLine());
            MatHang m = new MatHang(name, donvi, buy, sell);
            list.add(m);
        }
        Collections.sort(list);
        for( MatHang i : list){
            System.out.println(i);
        }
    }
}
