package model.facility;

public class House extends Facility {
    private String roomStandard;
    private int floorQuantity;
    
    public House() {
    }

    public House(int serviceId, String serviceName, double serviceUsageArea, double rentalFee, int maximumCustomerAmount, String rentalType, String roomStandard, int floorQuantity) {
        super(serviceId, serviceName, serviceUsageArea, rentalFee, maximumCustomerAmount, rentalType);
        this.roomStandard = roomStandard;
        this.floorQuantity = floorQuantity;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return floorQuantity;
    }

    public void setNumberOfFloor(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floorQuantity=" + floorQuantity +
                '}';
    }
}
