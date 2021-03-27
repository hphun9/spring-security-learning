package phung.springsecurity.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import phung.springsecurity.Model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByEmail(String email);
}
