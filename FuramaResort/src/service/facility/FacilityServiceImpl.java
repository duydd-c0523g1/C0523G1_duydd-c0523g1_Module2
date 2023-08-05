package service.facility;

import controller.sub_menu.FacilityManagementSubMenu;
import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.facility.FacilityRepositoryImpl;
import repository.facility.IFacilityRepository;

import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepositoryImpl();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayList() {
        Map<Facility, Integer> facilityMap = facilityRepository.displayList();
        for (Facility key : facilityMap.keySet()) {
            System.out.println(key + " - Number of bookings: " + facilityMap.get(key));
        }
    }

    @Override
    public void addNew() {
        FacilityManagementSubMenu.facilitySubMenu();
    }
    @Override
    public void addNewVilla() {
        System.out.println("Enter Villa ID: ");
        String facilityID = scanner.nextLine();
        System.out.println("Enter Villa Name: ");
        String facilityName = scanner.nextLine();
        System.out.println("Enter Area of Villa: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost: ");
        double rentalFee = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter max of capacity: ");
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type of rental(HOUR/DAY/MONTH/YEAR): ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter Room Standard: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Pool area: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Number of floor: ");
        int floorQuantity = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(facilityID, facilityName, area, rentalFee, maxCapacity, rentalType, roomStandard, poolArea, floorQuantity);
        facilityRepository.addNewVilla(villa);
        System.out.println("Done!");
    }
    @Override
    public void addNewHouse() {
        System.out.println("Enter House ID:");
        String facilityID = scanner.nextLine();
        System.out.println("Enter House Name: ");
        String facilityName = scanner.nextLine();
        System.out.println("Enter Area of House: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost: ");
        double rentalFee = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter max of capacity: ");
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type of rental(HOUR/DAY/MONTH/YEAR): ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter Room Standard: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Number of floor: ");
        int floorQuantity = Integer.parseInt(scanner.nextLine());
        House house = new House(facilityID, facilityName, area, rentalFee, maxCapacity, rentalType, roomStandard, floorQuantity);
        facilityRepository.addNewHouse(house);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter Room ID: ");
        String facilityID = scanner.nextLine();
        System.out.println("Enter Room Name: ");
        String facilityName = scanner.nextLine();
        System.out.println("Enter Area of Room: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost: ");
        double rentalFee = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter max of capacity: ");
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type of rental (HOUR/DAY/MONTH/YEAR): ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter room free included service: ");
        String roomFreeService = scanner.nextLine();
        Room room = new Room(facilityID, facilityName, area, rentalFee, maxCapacity, rentalType, roomFreeService);
        facilityRepository.addNewRoom(room);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        System.out.println("Enter Facility ID to delete: ");
        String id = scanner.nextLine();
        facilityRepository.delete(id);
    }

    @Override
    public void displayListFacilityMaintenance() {
        Map<Facility, Integer> facilityMaintenaceMap = facilityRepository.displayListFacilityMaintenance();
        for (Facility key : facilityMaintenaceMap.keySet()) {
            System.out.println(key + " - Number of bookings: " + facilityMaintenaceMap.get(key));
        }
    }
}
