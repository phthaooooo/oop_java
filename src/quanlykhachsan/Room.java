package quanlykhachsan;

public class Room {
    private String type, name;
    private int dongia, phiPV;

    public Room(String type, String name, int dongia, int phiPV) {
        this.type = type;
        this.name = name;
        this.dongia = dongia;
        this.phiPV = phiPV;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhiPV() {
        return phiPV;
    }

    public void setPhiPV(int phiPV) {
        this.phiPV = phiPV;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
