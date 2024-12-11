package tichmatranvachuyenvicuano;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Matrix {
    private int n, m;
    private int[][] data;

    public Matrix() {}

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        data = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sb.append(data[i][j]);
                if (j < data[i].length - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public Matrix trans() {
        Matrix b = new Matrix(m, n);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                b.data[j][i] = this.data[i][j];
            }
        }
        return b;
    }

    public Matrix mul(Matrix b) {
        int n = this.data.length;
        int m = b.data[0].length;
        int p = b.data.length; // Số dòng của ma trận B, cũng chính là số cột của A

        // Tạo ma trận kết quả với kích thước n x m
        Matrix result = new Matrix(n, m);

        // Tính tích ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    result.data[i][j] += this.data[i][k] * b.data[k][j];
                }
            }
        }
        return result;
    }

}

public class TichMaTranVaChuyenViCuaNo {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n, m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
