package inventorybackend.inventorybackend.repository;

import inventorybackend.inventorybackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
