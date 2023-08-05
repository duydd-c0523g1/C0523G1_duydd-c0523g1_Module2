package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        Facility villa1 = new Villa("SVVL-0001", "Luxury Villa 1", 300, 5000000, 6, "DAY", "Deluxe", 80, 2);
        Facility villa2 = new Villa("SVVL-0002", "Beach Villa 2", 250, 4000000, 6, "DAY", "Superior", 60, 2);
        Facility house1 = new House("SVHO-0001", "City House 1", 90, 2000000, 4, "DAY", "Standard", 2);
        Facility house2 = new House("SVHO-0002", "Country House 2", 80, 2000000, 4, "DAY", "Deluxe", 2);
        Facility room1 = new Room("SVRO-0001", "Double Room 1", 80, 2000000, 3, "DAY", "Massage");
        Facility room2 = new Room("SVRO-0002", "Single Room 2", 40, 500000, 1, "DAY", "Massage");
        facilityMap.put(villa1, 1);
        facilityMap.put(villa2, 3);
        facilityMap.put(house1, 10);
        facilityMap.put(house2, 6);
        facilityMap.put(room1, 2);
        facilityMap.put(room2, 6);
    }

    @Override
    public Map<Facility, Integer> displayList() {
        return facilityMap;
    }

    @Override
    public void addNew(Facility facility) {

    }

    @Override
    public void edit(String id, Facility facility) {

    }

    @Override
    public void delete(String id) {
        for (Facility key : facilityMap.keySet()) {
            if (key.getServiceId().equals(id)) {
                facilityMap.remove(key);
            }
        }
    }

    @Override
    public Map<Facility, Integer> displayListFacilityMaintenance() {
        Map<Facility, Integer> facilityMaintenaceMap = new LinkedHashMap<>();
        for (Facility key : facilityMap.keySet()) {
            int bookingFrequency = facilityMap.get(key);
            if (bookingFrequency >= 5) {
                facilityMaintenaceMap.put(key, bookingFrequency);
            }
        }
        return facilityMaintenaceMap;
    }

    @Override
    public void addNewVilla(Villa villa) {
        facilityMap.put(villa, 0);
    }

    @Override
    public void addNewHouse(House house) {
        facilityMap.put(house, 0);
    }

    @Override
    public void addNewRoom(Room room) {
        facilityMap.put(room, 0);
    }
}
