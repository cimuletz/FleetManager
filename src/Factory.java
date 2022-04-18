import employee.Driver;
import employee.Employee;
import employee.Salesperson;
import vehicle.Sedan;
import vehicle.Van;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Factory {
    Company company;
    private Factory(){
        company = new Company();
    }

    private static class SINGLETON_HOLDER{
        private static final Factory INSTANCE = new Factory();
    }
    public static Factory getInstance(){
        return Factory.SINGLETON_HOLDER.INSTANCE;
    }
    public Company getCompany(){
        company.setName("Construct SRL");
        Employee e1 = new Salesperson("Ion", "B", "01/01/2005", "0745088941", 65);
        Employee e2 = new Driver("Vasile", "C", "01/02/2015", "0745088458", 56);
        Vehicle v1 = new Sedan("VS01ABC", "Skoda Octavia", 15000, "B", 0);
        Vehicle v2 = new Van("VN01DBC", "Mercedes Sprinter", 54058, "C", 1500);
        ArrayList<Employee> emp= new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        ArrayList<Vehicle> veh= new ArrayList<Vehicle>();
        veh.add(v1);
        veh.add(v2);
        Warehouse w = new Warehouse("Depozit central", "Strada Florilor", veh);
        ArrayList<Warehouse> war = new ArrayList<Warehouse>();
        war.add(w);
        company.setWarehouses(war);
        return company;
    }
}
