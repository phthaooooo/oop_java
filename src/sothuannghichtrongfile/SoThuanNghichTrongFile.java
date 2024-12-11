package sothuannghichtrongfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoThuanNghichTrongFile {

    public static boolean isValid(String s){
        // tính thuận nghịch
        StringBuilder reversed_s = new StringBuilder(s).reverse();
        if (!reversed_s.toString().equals(s)){
            return false;
        }
        // tất cả các chữ số đều lẻ
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(Character.getNumericValue(x) % 2 == 0){
                return false;
            }
        }
        // số chữ số cũng là 1 số lẻ nhưng lớn hơn 1
        if(s.length() % 2 == 0 || s.length() <= 1) {
            return false;
        }
        //
        return true;
    }

    public static void main (String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois_1.readObject();
        ObjectInputStream ois_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois_2.readObject();
        int[] count = new int[1000001];
        for (int i = 0; i < a1.size(); i++) {
            String x = a1.get(i).toString();
            if(isValid(x) && a2.contains(a1.get(i))) {
                count[a1.get(i)]++;
            }
        }
        for (int i = 0; i < a2.size(); i++) {
            String x = a2.get(i).toString();
            if(isValid(x) && count[Integer.parseInt(x)] != 0) {
                count[a2.get(i)] ++;
            }
        }
        int dem = 0;
        for (int i = 0; i <= 1000000; i++) {
            if(count[i] > 0){
                dem++;
                System.out.println(i + " " + count[i]);
            }
            if(dem == 10) {
                break;
            }
        }

    }

}
