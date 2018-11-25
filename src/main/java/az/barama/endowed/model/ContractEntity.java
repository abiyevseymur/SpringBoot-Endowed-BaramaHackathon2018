package az.barama.endowed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contracts")
public class ContractEntity {
    @Id
    private Integer id;

    private Integer customerid;

    private LocalDate startdate;

    private LocalDate enddate;

    private String bankname;

    private BigDecimal balance;

    private int currentrate;

    public ContractEntity() { }

    public ContractEntity(Integer id, Integer customerid, LocalDate startdate, LocalDate enddate, String bankname, BigDecimal balance, int currentrate) {
        this.id = id;
        this.customerid = customerid;
        this.startdate = startdate;
        this.enddate = enddate;
        this.bankname = bankname;
        this.balance = balance;
        this.currentrate = currentrate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCurrentrate(int currentrate) {
        this.currentrate = currentrate;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public String getBankname() {
        return bankname;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getCurrentrate() {
        return currentrate;
    }
}
