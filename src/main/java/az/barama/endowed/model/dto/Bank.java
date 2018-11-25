package az.barama.endowed.model.dto;

import java.math.BigDecimal;

public class Bank {

    private int customerId;

    private BigDecimal interestRate;

    private BigDecimal amount;

    public Bank() {
    }

    public Bank(int customerId, BigDecimal interestRate, BigDecimal amount) {
        this.customerId = customerId;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
