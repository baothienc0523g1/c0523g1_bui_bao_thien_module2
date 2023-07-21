package case_study.service.facility_service;

import case_study.service.IService;

public interface IFacilityService extends IService {
    void getList();
    void addFacility();
    void getFacilityMaintenance();
    void removeById();
}
