package ss09_1_mvc.repo;

import ss09_1_mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
     ArrayList<Customer> getList();

    void add(Customer customer);
    void remove(int id);
    Customer find(String name);
}

