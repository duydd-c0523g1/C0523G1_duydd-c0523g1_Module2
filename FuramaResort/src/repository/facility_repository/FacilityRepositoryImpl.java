package repository.facility_repository;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import model.person.employee.Employee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        // Thêm dữ liệu ban đầu vào facilityMap nếu cần
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
    public ArrayList<Facility> displayList() {
        return null;
    }

    @Override
    public void addNew(Facility facility) {

    }

    @Override
    public void edit(String id, Facility facility) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
