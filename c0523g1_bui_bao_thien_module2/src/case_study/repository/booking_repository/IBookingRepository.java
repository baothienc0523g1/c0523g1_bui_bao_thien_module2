package case_study.repository.booking_repository;

import case_study.model.business.Booking;
import case_study.repository.IRepository;

import java.util.List;

public interface IBookingRepository<E> extends IRepository {
    @Override
    List<E> getList();
    void add(Booking booking);
    List<E> getListContracts();
    void editContracts(int id);
}
