package az.barama.endowed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class TransactionEntity {
    @Id
    private Integer id;

    private Integer contract_id;

    private Integer customer_id;

    private Integer transaction_amount;

    public TransactionEntity() { }

    public TransactionEntity(Integer id, Integer contract_id, Integer customer_id, Integer transaction_amount) {
        this.id = id;
        this.contract_id = contract_id;
        this.customer_id = customer_id;
        this.transaction_amount = transaction_amount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContract_id(Integer contract_id) {
        this.contract_id = contract_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setTransaction_amount(Integer transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public Integer getId() {
        return id;
    }

    public Integer getContract_id() {
        return contract_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getTransaction_amount() {
        return transaction_amount;
    }
}
