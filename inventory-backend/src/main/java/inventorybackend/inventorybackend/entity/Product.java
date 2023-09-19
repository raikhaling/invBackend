package inventorybackend.inventorybackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private long id;
    @Column(name = "qty")
    private int quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier suppliers;
}
