package tinhngayhethanbaohanh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MuaHang {
    private String codeC, nameC, address, codeP, dateMH;
    private int totalMoney, month, amount;
    private Product p;
    private Customer c;
    private String ngayHetHan;
    public MuaHang(Product p, Customer c) {
        this.p = p;
        this.c = c;
    }

    public String getCodeC() {
        return c.getCode();
    }

    public void setCodeC(String codeC) {
        this.codeC = codeC;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getTotalMoney() {
        return p.getPrice() * c.getAmount();
    }

    public String getNgayHetHan() {
       StringBuilder res = new StringBuilder();
       String startDate = c.getDate();
       int monthsToAdd = p.getMonth();
        // Định dạng ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Chuyển đổi chuỗi ngày thành đối tượng LocalDate
        LocalDate start = LocalDate.parse(startDate, formatter);

        // Cộng số tháng vào ngày bắt đầu
        LocalDate newDate = start.plusMonths(monthsToAdd);
        return newDate.format(formatter);

    }
    @Override
    public String toString(){
        //return getCodeC() + " " + getNameC() + " " + getCodeP();
        return c.getCode() + " " + c.getName() + " " + c.getAddress() + " " + p.getCode() + " " + getTotalMoney() + " " + getNgayHetHan() ;
    }
}
