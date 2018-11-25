package az.barama.endowed.service;

import az.barama.endowed.client.pashabank.BankClient;
import az.barama.endowed.dao.CustomerRepository;
import az.barama.endowed.model.CustomerEntity;
import az.barama.endowed.model.dto.Bank;
import az.barama.endowed.model.view.CustomerInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final BankClient bankClient;

    private final CustomerRepository repository;

    public CustomerService(BankClient pashaBankClient,
                           CustomerRepository repository) {
        this.bankClient = pashaBankClient;
        this.repository = repository;
    }

    public List<CustomerEntity> getAllCustomers() {
        return repository.findAll();
    }


    public Bank getInterestRate(CustomerInfo customerInfo){
// we have only 2 banks for test version.
        if(customerInfo.getBank().equals("PashaBank")){
            return this.bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else if (customerInfo.getBank().equals("KapitalBank")){
            return this.bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else {
            // Seymur has to check this.
            return null;
        }

    }


    public CustomerEntity findCustomerById(int id) {
        Optional<CustomerEntity> customer = repository.findById(id);
        return customer.get();
    }
}
