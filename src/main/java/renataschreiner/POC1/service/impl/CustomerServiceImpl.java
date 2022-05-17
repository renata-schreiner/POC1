package renataschreiner.POC1.service.impl;

import org.springframework.stereotype.Service;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.repositories.CustomerRepository;
import renataschreiner.POC1.service.CustomerService;

import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer newCustomer(final Customer customer) {
        if (Objects.equals(customer.getCpf_cnpj().length(), 11)) {
            customer.setType("Pessoa Física");
        }else
            customer.setType("Pessoa Jurídica");
        return customerRepository.save(customer);
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

