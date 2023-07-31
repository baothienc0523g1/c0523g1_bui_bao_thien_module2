package service.employee;

import service.IService;

public interface IEmployeeService extends IService {

    void edit();

    void searchByName();
    void delete();

}
