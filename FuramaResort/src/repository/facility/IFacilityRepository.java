package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IRepository;

import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility> {
    Map<Facility, Integer> displayListFacilityMaintenance();
    void addNewVilla(Villa villa);
    void addNewHouse(House house);
    void addNewRoom(Room room);
}
