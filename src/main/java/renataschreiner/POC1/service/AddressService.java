package renataschreiner.POC1.service;

import renataschreiner.POC1.model.entity.Address;

import java.util.Optional;

public interface AddressService {

    Address newAddress(Address address);
    void deleteAddress(final Long id);

    public Iterable<Address> getAddress();

    public Optional<Address> getAddressById(Long id);


}