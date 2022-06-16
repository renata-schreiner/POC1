package renataschreiner.POC1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.service.impl.AddressServiceImpl;
import renataschreiner.POC1.service.impl.CustomerServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressServiceImpl addressService;
    private final CustomerServiceImpl customerService;

    public AddressController(AddressServiceImpl addressService, CustomerServiceImpl customerService) {
        this.addressService = addressService;
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Address> newAddress(@RequestBody final Address address) {
        final Address newAddress = addressService.newAddress(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAddress);
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<Address> newAddress1(@RequestBody Address address, @PathVariable Long id) {
        Address newAddress = addressService.newAddressWithCustomerId(address, id);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAddress);
    }


    @DeleteMapping(path = "/{id}")
    public @ResponseBody ResponseEntity deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<Address> getAddress() {
        return addressService.getAddress();
    }

    @GetMapping(path = "/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

}