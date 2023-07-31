package repository.employee;

import model.person.Employee;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {

    void edit(String id, Employee employee);
    List<Employee> search(String name);
}
