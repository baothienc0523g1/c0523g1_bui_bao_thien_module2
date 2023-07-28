package service.employee;

import service.IService;

public interface IEmployeeService extends IService {
    @Override
    void getList();

    @Override
    void add();

    void edit();

    void delete();
    void searchByName();

}
