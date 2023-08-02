package model.facility;


public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double serviceUsageArea;
    private double rentalFee;
    private int maximumCustomerAmount;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double serviceUsageArea, double rentalFee, int maximumCustomerAmount, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceUsageArea = serviceUsageArea;
        this.rentalFee = rentalFee;
        this.maximumCustomerAmount = maximumCustomerAmount;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceUsageArea() {
        return serviceUsageArea;
    }

    public void setServiceUsageArea(double serviceUsageArea) {
        this.serviceUsageArea = serviceUsageArea;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaximumCustomerAmount() {
        return maximumCustomerAmount;
    }

    public void setMaximumCustomerAmount(int maximumCustomerAmount) {
        this.maximumCustomerAmount = maximumCustomerAmount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceUsageArea=" + serviceUsageArea +
                ", rentalFee=" + rentalFee +
                ", maximumCustomerAmount=" + maximumCustomerAmount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
