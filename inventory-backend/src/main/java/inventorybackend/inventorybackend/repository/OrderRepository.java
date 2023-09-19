package inventorybackend.inventorybackend.repository;

import inventorybackend.inventorybackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
