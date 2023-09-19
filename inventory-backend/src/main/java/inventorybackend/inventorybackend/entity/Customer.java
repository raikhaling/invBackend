package inventorybackend.inventorybackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class Customer {
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
