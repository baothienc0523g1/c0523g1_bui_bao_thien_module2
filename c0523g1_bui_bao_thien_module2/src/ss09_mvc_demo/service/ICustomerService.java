package ss09_mvc_demo.service;

import ss09_mvc_demo.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    /*CRUD*/
    ArrayList<Customer> getList();
    void add(Customer customer);
    void remove(int id);
    void find(String name);

}
