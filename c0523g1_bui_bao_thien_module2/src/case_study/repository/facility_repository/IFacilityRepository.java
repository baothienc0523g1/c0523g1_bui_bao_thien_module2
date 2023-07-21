package case_study.repository.facility_repository;

import case_study.model.facility.Facility;
import case_study.repository.IRepository;

import java.util.List;

public interface IFacilityRepository<E> extends IRepository {
    @Override
    List getList();
    void add(Facility facility);
    void removeById(int id);
}
