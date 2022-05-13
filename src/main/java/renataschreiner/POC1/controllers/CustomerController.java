package renataschreiner.POC1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.repositories.CustomerRepository;
import renataschreiner.POC1.service.impl.CustomerServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer newCustomer(@RequestBody Customer customer) {
        customerService.newCustomer(customer);
        return customer;
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody ResponseEntity deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @GetMapping(path = "/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

}