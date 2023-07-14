package ss09_1_mvc.service;

import ss09_1_mvc.model.Customer;
import ss09_1_mvc.repo.CustomerRepository;
import ss09_1_mvc.repo.ICustomerRepository;

import java.util.ArrayList;

public class CustomerService implements ICustomerService {

    private ICustomerRepository repo = new CustomerRepository();

    @Override
    public ArrayList<Customer> getList() {
       return repo.getList();
    }

    @Override
    public void add(Customer customer) {
        repo.add(customer);
    }

    @Override
    public void remove(int id) {
        repo.remove(id);
    }

    @Override
    public Customer find(String name) {
        return repo.find(name);
    }
}

