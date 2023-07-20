package case_study.service.employee;

import case_study.service.IService;

public interface IEmployeeService extends IService {
    @Override
    void getList();
    void addEmployee();
    void editById();
    void removeById();
}
