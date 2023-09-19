package inventorybackend.inventorybackend.service;

import inventorybackend.inventorybackend.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void saveProduct(Product product);
    void deletePrdouct(Long id);
}
