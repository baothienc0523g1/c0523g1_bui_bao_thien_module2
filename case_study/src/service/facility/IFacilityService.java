package service.facility;

import service.IService;

public interface IFacilityService extends IService {

    void getMaintenanceList();
    void delete();
    boolean idCheck(String id);
    void getVillaIdList();
    void getHouseIdList();
    void getRoomIdList();

}
