package inventorybackend.inventorybackend.service.impl;

import inventorybackend.inventorybackend.entity.Customer;
import inventorybackend.inventorybackend.exception.EntityNotFoundException;
import inventorybackend.inventorybackend.repository.CustomerRepository;
import inventorybackend.inventorybackend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(()->
                        new EntityNotFoundException("Customer not found with id: "+id));}

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
