package repository.employee;

import model.person.Employee;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    @Override
    List<Employee> getList();
    void add(Employee employee);
    void edit(String id, Employee employee);
    void delete(String id);
    List<Employee> searchByName(String name);
}
