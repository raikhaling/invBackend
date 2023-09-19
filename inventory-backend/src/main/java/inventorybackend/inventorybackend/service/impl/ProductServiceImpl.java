package inventorybackend.inventorybackend.service.impl;

import inventorybackend.inventorybackend.entity.Product;
import inventorybackend.inventorybackend.repository.ProductRepository;
import inventorybackend.inventorybackend.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Product not found with id: "+id));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deletePrdouct(Long id) {
        productRepository.deleteById(id);
    }
}
