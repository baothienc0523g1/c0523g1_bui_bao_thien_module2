package case_study.repository.employee_repository;

import case_study.model.person.Employee;
import case_study.repository.IRepository;

import java.util.List;

public interface IEmployeeRepository<E> extends IRepository {
    @Override
    List<E> getList();
    void add(Employee employee);
    void edit(int id);
    void remove(int id);
    List<E> searchByName(String name);


}
