package az.barama.endowed.controller;

import az.barama.endowed.model.TransactionEntity;
import az.barama.endowed.service.TransactionService;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    
    public TransactionEntity newTransaction(@JsonView TransactionEntity newTransaction){
        return transactionService.save(newTransaction);
    }
    @GetMapping("/get_transaction/{id}")
    public TransactionEntity getTransaction(@PathVariable int id) {
        return transactionService.getTransactions(id);
    }
}
