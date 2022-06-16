package renataschreiner.POC1.service.impl;

import org.springframework.stereotype.Service;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.repositories.AddressRepository;
import renataschreiner.POC1.repositories.CustomerRepository;
import renataschreiner.POC1.service.CustomerService;

import java.util.Objects;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final AddressRepository addressRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, AddressRepository addressRepository) {
        this.customerRepository = customerRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public Customer newCustomer(final Customer customer) {

        Boolean isFisico = Objects.equals(customer.getCpf_cnpj().length(), 11);
        String type = isFisico ? "Pessoa Física" : "Pessoa Jurídica";
        customer.setType(type);
        customerRepository.save(customer);

        final Address address = customer.getAddresses().get(0);
        address.setCustomer(customer);



        addressRepository.save(address);

        return customer;
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