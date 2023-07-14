package ss09_mvc_demo.repo;

import ss09_mvc_demo.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
     ArrayList<Customer> getList();

    void add(Customer customer);
    void remove(int id);
    void find(String name);
}

