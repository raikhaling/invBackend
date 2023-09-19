package inventorybackend.inventorybackend.service.impl;

import inventorybackend.inventorybackend.entity.Order;
import inventorybackend.inventorybackend.entity.Product;
import inventorybackend.inventorybackend.repository.OrderRepository;
import inventorybackend.inventorybackend.service.OrderService;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Order not found with id: "+id));
    }

    @Override
    public List<Order> getAllProducts() {
        return orderRepository.findAll();
    }

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
