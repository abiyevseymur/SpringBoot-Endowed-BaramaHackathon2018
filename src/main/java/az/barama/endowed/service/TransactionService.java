package az.barama.endowed.service;

import az.barama.endowed.dao.TransactionRepository;
import az.barama.endowed.model.TransactionEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Optional<TransactionEntity> getTransactions(int contractId){

        return repository.findById(contractId);
    }
}
