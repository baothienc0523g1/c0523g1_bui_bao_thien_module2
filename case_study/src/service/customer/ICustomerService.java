package service.customer;

import service.IService;

public interface ICustomerService extends IService {
    @Override
    void getList();

    @Override
    void add();

    void edit();

    void delete();

    void searchByName();
    void getIdAndName();
    boolean idCheck(String id);
}
