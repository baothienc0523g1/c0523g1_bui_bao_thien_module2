package repository.facility;

import model.facility.Facility;
import repository.IRepository;

import java.util.List;

public interface IFacilityRepository extends IRepository {
    @Override
    List<String> getList();
    void add(Facility facility);
    List<String> getMaintenanceList();
    void delete(int serviceID);
}
