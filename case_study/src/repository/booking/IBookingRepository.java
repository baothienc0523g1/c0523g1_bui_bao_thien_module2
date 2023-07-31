package repository.booking;

import model.business.Booking;
import model.business.Contract;
import repository.IRepository;

import java.util.List;

public interface IBookingRepository extends IRepository<Booking> {
    void createNewContracts(Contract contract);
    List<String> getContractList();
}
