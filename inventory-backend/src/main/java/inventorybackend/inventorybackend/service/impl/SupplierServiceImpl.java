package inventorybackend.inventorybackend.service.impl;

import inventorybackend.inventorybackend.entity.Supplier;
import inventorybackend.inventorybackend.repository.SupplierRepository;
import inventorybackend.inventorybackend.service.SupplerService;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplerService {
    private final SupplierRepository supplierRepository;
    @Override
    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Supplier not found with id: "+id));
    }

    @Override
    public List<Supplier> getSuppliers(Long id) {
        return supplierRepository.findAll();
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
