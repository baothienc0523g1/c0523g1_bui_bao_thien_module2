package repository.customer;

import model.person.Customer;
import repository.IRepository;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    @Override
    List<Customer> getList();
    void add(Customer customer);
    void edit(String id, Customer customer);
    void delete(String id);
    List<Customer> searchByName(String name);
}
