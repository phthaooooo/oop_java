package tinhngayhethanbaohanh;

public class Customer {
    private static int id = 1;
    private String code, name, address, codeP, date;
    private int amount;

    public Customer(String name, String address, String codeP, int amount, String date) {
        this.code = String.format("KH%02d", id++);
        this.address = address;
        this.codeP = codeP;
        this.date = date;
        this.amount = amount;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
