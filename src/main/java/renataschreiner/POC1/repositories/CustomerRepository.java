package renataschreiner.POC1.repositories;

import org.springframework.data.repository.CrudRepository;
import renataschreiner.POC1.model.entity.Customer;

public interface CustomerRepository
        extends CrudRepository<Customer, Long> {

}