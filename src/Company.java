import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Warehouse> warehouses = new ArrayList<Warehouse>();

    public Company(String name, ArrayList<Warehouse> warehouses) {
        this.name = name;
        this.warehouses = warehouses;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(ArrayList<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public Warehouse getWarehouse(int index){
        return warehouses.get(index);
    }
    public String printWarehouses(){
        int i = 1;
        String result = "";
        for(Warehouse w : warehouses){
            result = result +  String.valueOf(i) + ". " +  w.getName() + "\n";
            i++;
        }
        return result;
    }
}
