package case_study.service.booking;

import case_study.service.IService;

public interface IBookingService extends IService {
    @Override
    void getList();
    void add();
    void createContracts();
    void editContract();
}
