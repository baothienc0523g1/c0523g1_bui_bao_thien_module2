package ss09_1_mvc.service;

import ss09_1_mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    /*CRUD*/
    ArrayList<Customer> getList();
    void add(Customer customer);
    void remove(int id);
    Customer find(String name);

}
