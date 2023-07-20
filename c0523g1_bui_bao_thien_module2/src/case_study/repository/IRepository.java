package case_study.repository;

import java.util.List;

public interface IEmployeeRepository<E> {
    List<E> getList();
}
