package repository.facility_repository;

import model.facility.Facility;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;

public interface IFacilityRepository extends IRepository<Facility> {
    void displayListFacilityMaintenance();
}
