package BanHang;

public class Customer {
    private String address;
    private String code;
    private String name;
    public Customer(String address, String code, String name) {
            this.address = address;
            this.code = code;
            this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


