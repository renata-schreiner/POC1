package renataschreiner.POC1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import renataschreiner.POC1.model.entity.Customer;


public interface CustomerRepository
        extends JpaRepository<Customer, Long> {

}
