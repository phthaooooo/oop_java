package BanHang;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderLine> orderLines;
    private Currency total;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderLines = new ArrayList<>();
        this.total = Currency.getInstance("USD");
    }

    public void addLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public void removeLine(OrderLine orderLine) {
        orderLines.remove(orderLine);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Currency getTotal() {
        return total;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
