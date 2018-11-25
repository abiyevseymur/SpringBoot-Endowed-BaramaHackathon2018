package az.barama.endowed.service;

import az.barama.endowed.dao.ContractRepository;
import az.barama.endowed.model.ContractEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ContractService {
    private final ContractRepository repository;

    public ContractService(ContractRepository repository) {
        this.repository = repository;
    }

    public Optional<ContractEntity> getContractEndDate(int id) {
        return repository.findById(id);
    }

    public List<ContractEntity> getContracts(){
        return repository.findAll();
    }

    public ContractEntity getBalanceByContractId(int id){
        List<ContractEntity> rep = repository.findAll();
        for (ContractEntity c : rep) {
            if(c.getCustomerid().equals(id))
                return repository.findById(c.getId()).get();
        }
        return null;
    }

}
