package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IRepository;

import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility> {
    Map<Facility, Integer> displayListFacilityMaintenance();

    void addNewVilla(Facility villa);

    void addNewHouse(Facility house);

    void addNewRoom(Facility room);

}