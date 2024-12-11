package SoKhacNhauTrongFile;

import java.io.*;
import java.util.Scanner;

public class Sokhacnhautrongfile {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        DataInputStream fis = new DataInputStream(new FileInputStream("DATA.IN"));
            int[] a = new int[1000];
            for (int i = 0; i < 100000; i++) {
                a[fis.readInt()]++;
            }
            for (int i = 0; i < 1000; i++) {
                if(a[i] > 0){
                    System.out.println(i + " " + a[i]);
                }
            }
        }
    }



