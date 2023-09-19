package inventorybackend.inventorybackend.repository;

import inventorybackend.inventorybackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
