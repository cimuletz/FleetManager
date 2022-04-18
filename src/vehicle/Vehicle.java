package vehicle;

public abstract class Vehicle {
    private String numberPlate;
    private String model;
    private int mileage;
    private String licenseRequirement;
    private int maxLoad; // maximum carrying capacity of the vehicle

    public Vehicle(String numberPlate, String model, int mileage, String licenseRequirement, int maxLoad) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.mileage = mileage;
        this.licenseRequirement = licenseRequirement;
        this.maxLoad = maxLoad;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getLicenseRequirement() {
        return licenseRequirement;
    }

    public void setLicenseRequirement(String licenseRequirement) {
        this.licenseRequirement = licenseRequirement;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String getPrintable(){
        return this.model + " " + this.numberPlate;
    }

    public abstract double getEstimatedCost(double gasPrice); // returns estimated lifetime fuel cost for a given average gas price
}
