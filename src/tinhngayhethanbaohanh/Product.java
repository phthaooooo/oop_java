package tinhngayhethanbaohanh;

public class Product {
    private String code, name;
    private int price, month;

    public Product(){}

    public Product(String code, String name, int price, int month){
        this.code = code;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
