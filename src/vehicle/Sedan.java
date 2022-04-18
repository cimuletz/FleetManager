package vehicle;

public class Sedan extends Vehicle{

    public Sedan(String numberPlate, String model, int mileage, String licenseRequirement, int maxLoad) {
        super(numberPlate, model, mileage, licenseRequirement, maxLoad);
    }

    @Override
    public double getEstimatedCost(double gasPrice) {
        return 1.0*this.getMileage() / 100 * 8 * gasPrice;
    }
}
