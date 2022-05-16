package renataschreiner.POC1.service.impl;

import org.springframework.stereotype.Service;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.repositories.CustomerRepository;
import renataschreiner.POC1.service.CustomerService;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    @Override
    public void newCustomer(final Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(final Long id) {
        customerRepository.deleteById(id);
    }

    public Iterable<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }


}

