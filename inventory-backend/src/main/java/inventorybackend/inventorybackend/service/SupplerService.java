package inventorybackend.inventorybackend.service;

import inventorybackend.inventorybackend.entity.Supplier;

import java.util.List;

public interface SupplerService {
    Supplier getSupplierById(Long id);
    List<Supplier> getSuppliers(Long id);
    void save(Supplier supplier);
    void deleteSupplier(Long id);

}
