package renataschreiner.POC1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import renataschreiner.POC1.model.entity.Address;

public interface AddressRepository
        extends JpaRepository<Address, Long> {

}
