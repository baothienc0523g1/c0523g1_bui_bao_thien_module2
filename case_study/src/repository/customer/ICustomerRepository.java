package repository.customer;

import model.person.Customer;
import repository.IRepository;

import java.util.List;


public interface ICustomerRepository extends IRepository<Customer> {
    void edit(String id, Customer customer);
    List<Customer> search(String name);
}
