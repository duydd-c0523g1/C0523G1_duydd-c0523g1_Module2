package service.booking_service;

import com.sun.deploy.services.Service;
import service.IService;

public interface IBookingService extends IService {

    //Contract
    void displayContractList();
    void editContract();
}
