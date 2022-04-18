import employee.Employee;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWarehouse implements WarehouseInterface{
    private String name;
    private String address;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public MainWarehouse(String name, String address, ArrayList<Vehicle> vehicles, ArrayList<Employee> employees) {
        this.name = name;
        this.address = address;
        this.vehicles = vehicles;
        this.employees = employees;
    }

    @Override
    public String getWarehouseInformation() {
        String result = this.getName() + "\nVehicule:\n";
        //vehicles sorted by mileage
        Collections.sort(vehicles, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getMileage() - o2.getMileage();
            }
        });
        for(Vehicle v : vehicles){
            result += v.getPrintable();
            result += "\n";
        }
        result += "Angajati:\n";
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Employee e : employees){
            result += e.getPrintable();
            result += "\n";
        }
        return result;
    }

    @Override
    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }
    @Override
    public void removeVehicle(int index){
        vehicles.remove(index);
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void removeEmployee(int index){
        employees.remove(index);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
