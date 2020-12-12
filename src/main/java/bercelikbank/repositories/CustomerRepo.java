package bercelikbank.repositories;

import bercelikbank.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {
    Customer findFirstByFirstName(String firstName);
    List<Customer> findAllByFirstName(String firstName);
}
