package repository.facility;

import model.facility.Facility;
import repository.IRepository;

public interface IFacilityRepository extends IRepository<Facility> {
    void displayListFacilityMaintenance();
}
