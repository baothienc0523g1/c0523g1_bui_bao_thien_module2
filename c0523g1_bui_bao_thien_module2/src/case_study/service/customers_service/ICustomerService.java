package case_study.service.customers;

import case_study.service.IService;

public interface ICustomerService extends IService {
    @Override
    void getList();
    void addCustomer();
    void editById();
    void removeById();
    void searchByName();

}
