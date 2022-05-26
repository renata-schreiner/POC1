package renataschreiner.POC1.service;

import renataschreiner.POC1.model.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer newCustomer(Customer customer);

    void deleteCustomer(final Long id);

    Iterable<Customer> getCustomer();

    Optional<Customer> getCustomerById(Long id);

}
