package renataschreiner.POC1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.service.impl.CustomerServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.newCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
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