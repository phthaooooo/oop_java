package LietKeSinhVienTheoLop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LietKeSinhVienTheoLop {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        while (N-- >0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String cLass = sc.nextLine();
            String email = sc.nextLine();
            students.add(new Student(code, name, cLass, email));
        }
        int Q = Integer.parseInt(sc.nextLine());
        List<String> queries = new ArrayList<>();
        while (Q-- >0) {
            String query_cLass = sc.nextLine();
            queries.add(query_cLass);
        }
        for (int i = 0; i < queries.size(); i++) {
            System.out.println("DANH SACH SINH VIEN LOP " + queries.get(i) + ":");
            for (Student j : students) {
                if(queries.get(i).equals(j.getcLass())) {
                    System.out.println(j);
                }
            }
        }
    }
}
