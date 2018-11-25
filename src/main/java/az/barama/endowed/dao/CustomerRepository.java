package az.barama.endowed.dao;

import az.barama.endowed.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
