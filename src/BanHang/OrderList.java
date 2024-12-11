package BanHang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderList {
    private List<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order) {
        orders.add(order);
    }

    public void remove(Order order) {
        orders.remove(order);
    }


    public int getCount() {
        return orders.size();
    }

    public Iterator<Order> getIterator() {
        return orders.iterator();
    }
}
