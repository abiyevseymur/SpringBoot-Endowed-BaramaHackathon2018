package az.barama.endowed.model.view;

public class CustomerInfo {

    private int customerId;

    private String bank;

    private String cardNumber;

    public CustomerInfo() {
    }

    public CustomerInfo(int customerId, String bank, String cardNumber) {
        this.customerId = customerId;
        this.bank = bank;
        this.cardNumber = cardNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
