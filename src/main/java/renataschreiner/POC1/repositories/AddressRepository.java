package renataschreiner.POC1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import renataschreiner.POC1.model.entity.Address;
import renataschreiner.POC1.model.entity.Customer;

public interface AddressRepository
        extends JpaRepository<Address, Long> {

}
