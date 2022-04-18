package vehicle;

public class Van extends Vehicle{
    public Van(String numberPlate, String model, int mileage, String licenseRequirement, int maxLoad) {
        super(numberPlate, model, mileage, licenseRequirement, maxLoad);
    }

    @Override
    public double getEstimatedCost(double gasPrice) {
        return 1.0*this.getMileage()/100 * 10.5 * gasPrice;
    }
}
