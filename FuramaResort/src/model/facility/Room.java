package model.facility;

public class Room extends Facility {
    private String additionalFreeService;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double serviceUsageArea, double rentalFee, int maximumCustomerAmount, String rentalType, String additionalFreeService) {
        super(serviceId, serviceName, serviceUsageArea, rentalFee, maximumCustomerAmount, rentalType);
        this.additionalFreeService = additionalFreeService;
    }

    public String getAdditionalFreeService() {
        return additionalFreeService;
    }

    public void setAdditionalFreeService(String additionalFreeService) {
        this.additionalFreeService = additionalFreeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "additionalFreeService='" + additionalFreeService + '\'' +
                '}';
    }
}
