package renataschreiner.POC1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.repositories.AddressRepository;
import renataschreiner.POC1.service.impl.AddressServiceImpl;
import renataschreiner.POC1.service.impl.CustomerServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;
    private final AddressServiceImpl addressService;

    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address newAddress(@RequestBody Address address) {
        addressService.newAddress(address);
        return address;
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody ResponseEntity deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<Address> getAddressr() {
        return addressService.getAddress();
    }

    @GetMapping(path = "/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id) {return addressService.getAddressById(id);

    }

}


