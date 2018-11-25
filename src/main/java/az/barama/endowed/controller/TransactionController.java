package az.barama.endowed.controller;

import az.barama.endowed.model.TransactionEntity;
import az.barama.endowed.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/get-tr/{id}")
    public Optional<TransactionEntity> getEndDate(@PathVariable int id) {
        return transactionService.getTransactions(id);
    }
}
