package inventorybackend.inventorybackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    @OneToMany(mappedBy = "supplier")
    private List<Product> productsList;
}
