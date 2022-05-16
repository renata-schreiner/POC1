package renataschreiner.POC1.repositories;

import org.springframework.data.repository.CrudRepository;
import renataschreiner.POC1.model.entity.Address;

public interface AddressRepository
        extends CrudRepository<Address, Long> {

}