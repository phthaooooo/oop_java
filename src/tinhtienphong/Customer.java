package tinhtienphong;

import java.util.Date;

class Customer {
    public static int num_id = 1;
    private String id, name, roomID;
    private int timeByDay, price, totalCost;

    public Customer(String name, String roomID, Date checkInDate, Date checkOutDate, int serviceFee) {
        this.id = String.format("KH%02d", num_id++);
        this.name = formatName(name);
        this.roomID = roomID;
        switch (roomID.substring(0, 1)) {
            case "1":
                price = 25;
                break;
            case "2":
                price = 34;
                break;
            case "3":
                price = 50;
                break;
            case "4":
                price = 80;
                break;
        }
        this.timeByDay = calculateTime (checkInDate, checkOutDate);
        this.totalCost = price * timeByDay + serviceFee;
    }

    private String formatName(String s) {
        s = s.toLowerCase();
        String[] temp = s.split("\\s+");
        StringBuilder reName = new StringBuilder();
        for (String i : temp) {
            reName.append(Character.toUpperCase(i.charAt(0)))
                    .append(i.substring(1))
                    .append(" ");
        }
        return reName.toString();
    }
    private int calculateTime(Date checkIn, Date checkOut) {
        long in = checkIn.getTime();
        long out = checkOut.getTime();
        return (int) ((out - in) / (1000 * 60 * 60 * 24)) + 1;
    }
    public int getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + roomID + " " + timeByDay + " " + totalCost;
    }
}
