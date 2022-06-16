package renataschreiner.POC1.service.impl;

import org.springframework.stereotype.Service;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.model.entity.Customer;
import renataschreiner.POC1.repositories.AddressRepository;
import renataschreiner.POC1.repositories.CustomerRepository;
import renataschreiner.POC1.service.AddressService;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {


    private final AddressRepository addressRepository;

    private final CustomerRepository customerRepository;

    public AddressServiceImpl(AddressRepository addressRepository, CustomerRepository customerRepository) {
        this.addressRepository = addressRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public Address newAddress(final Address address) {
        return addressRepository.save(address);
    }


    public Address newAddressWithCustomerId(Address address, Long id) {
        Customer customer = customerRepository.getById(id);

        if (address.getPrimary() == true) {
            verificaSeOpcional(customer);
        }

        address.setCustomer(customer);
        addressRepository.save(address);
        return address;
    }

    public void deleteAddress(final Long id) {
        addressRepository.deleteById(id);
    }

    public Iterable<Address> getAddress() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    private void verificaSeOpcional(Customer customer) {
        customer = customerRepository.getById(customer.getId());

        for (Address x : customer.getAddresses()) {
            if (x.getPrimary() == true) {
                x.setPrimary(false);
            }
        }
    }

}