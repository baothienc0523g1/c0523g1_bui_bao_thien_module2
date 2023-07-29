package service.facility;

import service.IService;

public interface IFacilityService extends IService {
    @Override
    void getList();

    @Override
    void add();

    void getMaintenanceList();
    void delete();

}
