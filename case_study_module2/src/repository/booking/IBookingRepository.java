package repository.booking;

import model.business.Booking;
import model.business.Contract;
import repository.IRepository;

import java.util.List;

public interface IBookingRepository extends IRepository {
    void add(Booking booking);
    @Override
    List<String> getList();
    void createNewContracts(Contract contract);
    List<String> getContractList();
}
