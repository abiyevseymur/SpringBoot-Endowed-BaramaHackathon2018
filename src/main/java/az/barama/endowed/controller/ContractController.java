package az.barama.endowed.controller;

import az.barama.endowed.model.ContractEntity;
import az.barama.endowed.service.ContractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ContractController {
    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/get_contract_end_date/{id}")
    public Optional<ContractEntity> getEndDate(@PathVariable int id) {
        return contractService.getContractEndDate(id);
    }

    @GetMapping("/get-contract-by-id/{id}")
    public ContractEntity getContractById(@PathVariable int id){
        return contractService.getBalanceByContractId(id);
    }

    @GetMapping("/get_contracts")
    public List<ContractEntity> getAllContracts() {
        return contractService.getContracts();
    }
}
