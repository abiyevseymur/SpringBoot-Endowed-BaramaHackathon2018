package az.barama.endowed.controller;

import az.barama.endowed.dao.CustomerRepository;
import az.barama.endowed.model.CustomerEntity;
import az.barama.endowed.model.dto.Bank;
import az.barama.endowed.model.view.CustomerInfo;
import az.barama.endowed.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/find_all")
//    @RequestMapping(name = "/find_all", method = RequestMethod.GET)
    public List<CustomerEntity> findAll() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/get-interest-rate")
    public Bank getInterestRate(@RequestBody CustomerInfo customerInfo) {
        System.out.println("test");
        return customerService.getInterestRate(customerInfo);
    }

    @GetMapping("/get/{id}")
    public CustomerEntity getCustomer(@PathVariable int id) {
        return customerService.findCustomerById(id);
    }

}
