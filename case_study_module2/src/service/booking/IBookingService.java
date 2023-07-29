package service.booking;

import service.IService;

public interface IBookingService extends IService {
    @Override
    void getList();

    @Override
    void add();

    void addNewContract();

    void displayContract();

    void editContract();
}
