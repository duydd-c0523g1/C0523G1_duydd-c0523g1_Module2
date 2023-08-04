package service.facility;

import service.IService;

public interface IFacilityService extends IService {
    void displayListFacilityMaintenance();
    void addNewVilla();
    void addNewHouse();
    void addNewRoom();
}
