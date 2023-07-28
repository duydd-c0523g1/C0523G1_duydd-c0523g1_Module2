package model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floorQuantity;
    public Villa() {
    }

    public Villa(int serviceId, String serviceName, double serviceUsageArea, double rentalFee, int maximumCustomerAmount, String rentalType, String roomStandard, double poolArea, int floorQuantity) {
        super(serviceId, serviceName, serviceUsageArea, rentalFee, maximumCustomerAmount, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorQuantity = floorQuantity;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return floorQuantity;
    }

    public void setNumberOfFloor(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorQuantity=" + floorQuantity +
                '}';
    }
}
