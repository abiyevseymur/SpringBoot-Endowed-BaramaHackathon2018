package az.barama.endowed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class TransactionEntity {
    @Id
    private Integer id;

    private Integer contact_id;

    private Integer customer_id;

    private Integer transaction_ammount;

    public TransactionEntity() { }

    public TransactionEntity(Integer id, Integer contact_id, Integer customer_id, Integer transaction_ammount) {
        this.id = id;
        this.contact_id = contact_id;
        this.customer_id = customer_id;
        this.transaction_ammount = transaction_ammount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContact_id(Integer contact_id) {
        this.contact_id = contact_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setTransaction_ammount(Integer transaction_ammount) {
        this.transaction_ammount = transaction_ammount;
    }

    public Integer getId() {
        return id;
    }

    public Integer getContact_id() {
        return contact_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getTransaction_ammount() {
        return transaction_ammount;
    }
}
