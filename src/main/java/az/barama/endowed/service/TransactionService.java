package az.barama.endowed.service;

import az.barama.endowed.dao.TransactionRepository;
import az.barama.endowed.model.TransactionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public TransactionEntity save(TransactionEntity newTransaction){
        repository.save(newTransaction);
        return newTransaction;
    }

    public TransactionEntity getTransactions(int id){
        List<TransactionEntity> rep = repository.findAll();
        for (TransactionEntity tmp : rep) {
            if(tmp.getContract_id().equals(id)){
                return tmp;
            }
        }
        return null;
    }
}
