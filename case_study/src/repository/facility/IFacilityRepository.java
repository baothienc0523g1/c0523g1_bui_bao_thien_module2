package repository.facility;

import model.facility.Facility;
import repository.IRepository;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    List<String> getMaintenanceList();
}
