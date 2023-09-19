package inventorybackend.inventorybackend.service;

import inventorybackend.inventorybackend.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomer();
    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
}
