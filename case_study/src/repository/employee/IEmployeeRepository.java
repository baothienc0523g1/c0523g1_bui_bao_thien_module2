package repository.employee;

import model.person.Employee;
import repository.IRepository;

import java.util.List;
import java.util.Map;

public interface IEmployeeRepository extends IRepository<Employee> {

    void edit(String id, Employee employee);
    List<Employee> search(String name);
    void delete(String id);
    Map<String, String> getIdAndName();
}
