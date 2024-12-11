package tinhluong;

public class NhanVien {
   // private PhongBan phongBan;
    private  String code, name, nameofPhongban;
    private  int luongCoBan, soNgayCong, hesoNhan, year;
    private  char a;
    //public NhanVien(PhongBan phongBan){
   //     this.phongBan = phongBan;
    //}
    public NhanVien(String code, String name, int luongCoBan, int soNgayCong, String nameofPhongban) {
        this.code = code;
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.nameofPhongban = nameofPhongban;
        genCode(code);
        genHeSoNhan();
    }

    public void genCode(String code) {
        a = code.charAt(0);
        String year1 = code.substring(1, 3);
        year = (year1.charAt(0) - '0' ) * 10 + year1.charAt(1) - '0';

    }

    public String getNameofPhongban() {
        return nameofPhongban;
    }


    public void setNameofPhongban() {
        this.nameofPhongban = nameofPhongban;
    }

    public int genHeSoNhan(){
        if(a == 'A') {
            if (year >= 1 && year <=3) {
                hesoNhan = 10;
            }
            else if (year >= 4 && year <= 8) {
                hesoNhan = 12;
            } else if (year >= 9 && year <= 15) {
                hesoNhan = 14;
            } else {
                hesoNhan = 20;
            }
        } else if(a == 'B') {
            if (year >= 1 && year <=3) {
                hesoNhan = 10;
            }
            else if (year >= 4 && year <= 8) {
                hesoNhan = 11;
            } else if (year >= 9 && year <= 15) {
                hesoNhan = 13;
            } else {
                hesoNhan = 16;
            }
        } else if(a == 'C') {
            if (year >= 1 && year <= 3) {
                hesoNhan = 9;
            } else if (year >= 4 && year <= 8) {
                hesoNhan = 10;
            } else if (year >= 9 && year <= 15) {
                hesoNhan = 12;
            } else {
                hesoNhan = 14;
            }
        } else if(a == 'D') {
            if (year >= 1 && year <= 3) {
                hesoNhan = 8;
            } else if (year >= 4 && year <= 8) {
                hesoNhan = 9;
            } else if (year >= 9 && year <= 15) {
                hesoNhan = 11;
            } else {
                hesoNhan = 13;
            }
        }
        return hesoNhan;
    }
    // Luong Thang = Luong Co Ban * So Ngay Cong * He So Nhan * 1000
    public int luong() {
        return luongCoBan * soNgayCong * hesoNhan * 1000;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + " " + nameofPhongban + " " + luong();
    }

}
