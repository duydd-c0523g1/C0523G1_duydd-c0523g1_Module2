package repository.facility_repository;

import model.facility.Facility;
import repository.IRepository;

public interface IFacilityRepository extends IRepository<Facility> {
    void displayListFacilityMaintenance();

    @Override
    void displayList();

    @Override
    void addNew(Facility facility);

    @Override
    void edit(Facility facility);

    @Override
    void delete(int id);
}
