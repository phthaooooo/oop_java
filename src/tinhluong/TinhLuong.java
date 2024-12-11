package tinhluong;

// Luong Thang = Luong Co Ban * So Ngay Cong * He So Nhan * 1000

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TinhLuong{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        List<PhongBan> phongBans = new ArrayList<>();
        while (T-- > 0) {
            String input = sc.nextLine();
            phongBans.add(new PhongBan(input.substring(0, 2), input.substring(3)));
        }
        List<NhanVien> nhanViens = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int luongcoban = Integer.parseInt(sc.nextLine());
            int songaycong = Integer.parseInt(sc.nextLine());
            String phongban = "";
            for (PhongBan i : phongBans) {
                if(code.substring(3, 5).equals(i.getCode())){
                    phongban = i.getName();
                    break;
                }
            }
            nhanViens.add(new NhanVien(code, name, luongcoban, songaycong, phongban));
        }
        for (NhanVien i : nhanViens){
            System.out.println(i);
        }
    }
}
