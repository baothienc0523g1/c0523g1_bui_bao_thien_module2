package service.booking;

import service.IService;

public interface IBookingService extends IService {

    void addNewContract();

    void displayContract();

    void editContract();
}
