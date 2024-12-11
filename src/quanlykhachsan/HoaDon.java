package quanlykhachsan;

public class HoaDon {
    private Room r;
    private Customer c;
    private String codeR;
    public HoaDon(Room r, Customer c) {
        this.r = r;
        this.c = c;
    }

    public String getCodeR() {
        String tmp = c.getCodeR().substring(2, 3);
        return tmp;
    }

    public double getTotal() {
        double tienPhong;
        if(c.days() >= 10 && c.days() <= 20) {
            tienPhong = tienPhong - (tienPhong * 0.02);

        }
    }

}
