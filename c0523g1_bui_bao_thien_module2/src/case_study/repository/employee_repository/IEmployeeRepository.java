package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.repository.IRepository;

import java.util.List;

public interface IEmployeeRepository<E> extends IRepository {
    @Override
    List<E> getList();
    List<E> add(Employee employee);
    


}
