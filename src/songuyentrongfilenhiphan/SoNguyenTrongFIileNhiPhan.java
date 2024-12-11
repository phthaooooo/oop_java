package songuyentrongfilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoNguyenTrongFIileNhiPhan {

    public static int[] prime = new int[10000];

    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 100 ; i++) {
            if(prime[i] == 1) {
                for (int j = i * i; j < 10000 ; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, StreamCorruptedException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) ois.readObject();
        int[] a = new int[10000];
        for (Integer i : list) {
            a[i] += prime[i];
        }
        for (int i = 2; i < 10000; i++) {
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
