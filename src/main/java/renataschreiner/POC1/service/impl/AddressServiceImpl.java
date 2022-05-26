package renataschreiner.POC1.service.impl;

import org.springframework.stereotype.Service;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.repositories.AddressRepository;
import renataschreiner.POC1.service.AddressService;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address newAddress(final Address address) {
        return addressRepository.save(address);
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

}