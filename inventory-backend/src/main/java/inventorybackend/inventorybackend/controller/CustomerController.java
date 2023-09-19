package inventorybackend.inventorybackend.controller;

import inventorybackend.inventorybackend.entity.Customer;
import inventorybackend.inventorybackend.service.CustomerService;
import inventorybackend.inventorybackend.service.OrderService;
import inventorybackend.inventorybackend.service.ProductService;
import inventorybackend.inventorybackend.service.SupplerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    private final OrderService orderService;
    private final ProductService productService;
    private final SupplerService supplerService;

    @GetMapping("customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }


   @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
   }
   @PutMapping("/customers/{id}")
   public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,
                                                  @RequestBody Customer updateCustomer){
        Customer existingCustomer = customerService.getCustomerById(id);
        if(existingCustomer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updateCustomer.setId(id);
        customerService.saveCustomer(updateCustomer);
        return new ResponseEntity<>(updateCustomer,HttpStatus.OK);
   }
   @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Long id){
        Customer customer = customerService.getCustomerById(id);
        if(customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        // HTTP request was successful, but the server is not returning
       // any content in the response body.
   }

}
