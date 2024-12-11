package chuanhoaxauhoten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhiFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = " nGuYEN    vAN    naM\n" + "tRan    TRUNG Hieu\n" + "  vO le  hOa bINH\n" + "END" ;

        try {
            FileWriter fw = new FileWriter("D:\\codeptit_java\\OOP_CodePTIT\\src\\chuanhoaxauhoten\\DATA.in");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
