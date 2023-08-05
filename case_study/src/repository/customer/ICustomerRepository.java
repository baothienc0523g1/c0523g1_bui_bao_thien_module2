package repository.customer;

import model.person.Customer;
import repository.IRepository;

import java.util.List;
import java.util.Map;


public interface ICustomerRepository extends IRepository<Customer> {
    void edit(String id, Customer customer);

    List<Customer> search(String name);

    void delete(String id);
    Map<String, String> getIdAndName();
}
