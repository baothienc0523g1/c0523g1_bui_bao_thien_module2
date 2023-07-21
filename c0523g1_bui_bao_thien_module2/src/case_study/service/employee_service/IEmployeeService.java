package case_study.service.employee_service;

import case_study.service.IService;

public interface IEmployeeService extends IService {
    @Override
    void getList();
    void addEmployee();
    void editById();
    void removeById();
}
