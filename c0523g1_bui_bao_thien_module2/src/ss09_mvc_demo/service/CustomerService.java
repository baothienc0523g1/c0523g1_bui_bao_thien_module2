package ss09_mvc_demo.service;

import ss09_mvc_demo.model.Customer;
import ss09_mvc_demo.repo.CustomerRepository;
import ss09_mvc_demo.repo.ICustomerRepository;

import java.util.ArrayList;

public class CustomerService extends Customer implements ICustomerService {

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
    public void find(String name) {
        repo.find(name);
    }
}

