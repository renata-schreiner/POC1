package renataschreiner.POC1.service;

import renataschreiner.POC1.model.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer newCustomer(Customer customer);

    public void deleteCustomer(final Long id);

    public Iterable<Customer> getCustomer();

    public Optional<Customer> getCustomerById(Long id);

}
