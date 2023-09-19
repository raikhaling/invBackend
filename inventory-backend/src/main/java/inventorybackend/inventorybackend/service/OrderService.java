package inventorybackend.inventorybackend.service;

import inventorybackend.inventorybackend.entity.Order;


import java.util.List;

public interface OrderService {
    Order getOrderById(Long id);
    List<Order> getAllProducts();
    void saveOrder(Order order);
    void deleteOrder(Long id);
}
