package capsonguyentotrongfile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class CapSoNguyenToTrongFile1 {

    public static final int N = (int) 1e6;
    public static int[] prime = new int[N + 1];
    private static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= (int) 1e3 ; i++) {
            if(prime[i] == 1) {
                for (int j = i * i; j < (int)1e6 ; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oiss = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> nums1 = (ArrayList<Integer>) ois.readObject();
        List<Integer> nums2 = (ArrayList<Integer>) oiss.readObject();
        Map<Integer, Integer> res = new HashMap<>();
        Set<Integer> primeNums2 = new HashSet<>();
        Set<Integer> used = new HashSet<>();
        for (int num : nums2) {
            if (prime[num] == 1) {
                primeNums2.add(num);
            }
        }

        for (int num : nums1) {
            if (prime[num] == 1 && 1_000_000 - num > num && primeNums2.contains(1_000_000 - num) && !used.contains(1_000_000 - num)) {
                res.put(num, 1_000_000 - num);
            }
        }
        Map<Integer, Integer> output = new TreeMap<>(res);
        for (Map.Entry<Integer, Integer> entry : output.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
