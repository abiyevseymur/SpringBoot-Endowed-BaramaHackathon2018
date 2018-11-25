package az.barama.endowed.dao;

import az.barama.endowed.model.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<ContractEntity, Integer> {

}
