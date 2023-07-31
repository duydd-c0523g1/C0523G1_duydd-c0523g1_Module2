package repository.facility_repository;

import model.facility.Facility;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;

public interface IFacilityRepository extends IRepository<Facility> {
    void displayListFacilityMaintenance();

    @Override
    ArrayList<Employee> displayList();

    @Override
    void addNew(Facility facility);

    @Override
    void edit(Facility facility);

    @Override
    void delete(int id);
}
