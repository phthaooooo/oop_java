package BanHang;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tran Phu St", "C001", "Thao");

        Order order = new Order(customer);

        OrderLine orderLine1 = new OrderLine(Currency.getInstance("USD"));
        OrderLine orderLine2 = new OrderLine(Currency.getInstance("USD"));

        order.addLine(orderLine1);
        order.addLine(orderLine2);

        OrderList orderList = new OrderList();
        orderList.add(order);

        System.out.println("Total amount for the order: " + order.getTotal());
    }
}
