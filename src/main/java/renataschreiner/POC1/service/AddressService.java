package renataschreiner.POC1.service;

import renataschreiner.POC1.model.entity.Address;

import java.util.Optional;

public interface AddressService {

    Address newAddress(final Address address);
    void deleteAddress(final Long id);

    Iterable<Address> getAddress();

    Optional<Address> getAddressById(Long id);


}