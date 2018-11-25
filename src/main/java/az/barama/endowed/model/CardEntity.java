package az.barama.endowed.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;


public class CardEntity {
    private Integer id;

    private Integer customer_id;

    private String bank;

    private String card_number;

    private String cvv;

    private LocalDate expiration;

    private BigDecimal salary;

    public CardEntity() { }

    public CardEntity(Integer id, Integer customer_id,
                      String bank, String card_number,
                      String cvv, LocalDate expiration,
                      BigDecimal salary) {
        this.id = id;
        this.customer_id = customer_id;
        this.bank = bank;
        this.card_number = card_number;
        this.cvv = cvv;
        this.expiration = expiration;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public String getBank() {
        return bank;
    }

    public String getCard_number() {
        return card_number;
    }

    public String getCvv() {
        return cvv;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
