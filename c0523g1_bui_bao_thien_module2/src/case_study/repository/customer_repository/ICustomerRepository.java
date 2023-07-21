package case_study.repository.customer_repository;

import case_study.model.person.Customer;
import case_study.repository.IRepository;

import java.util.List;

public interface ICustomerRepository<E> extends IRepository {
    @Override
    List<E> getList();
    void addCustomer(Customer customer);
    void editById(int id);
    void removeById(int id);
    List<E> searchByName(String name);

}
