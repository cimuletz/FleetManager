import vehicle.Vehicle;

public interface WarehouseInterface {
    public String getWarehouseInformation();
    public void addVehicle(Vehicle v);
    public void removeVehicle(int index);
}
