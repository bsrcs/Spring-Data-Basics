package bercelikbank.repositories;

import bercelikbank.models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends CrudRepository<BankAccount, Long> {
}
