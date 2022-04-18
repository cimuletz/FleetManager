import vehicle.Sedan;
import vehicle.Van;
import vehicle.Vehicle;

import java.util.Scanner;

public class MenuService {
    Scanner scanner;
    Company company;
    private MenuService(){
         scanner = new Scanner(System.in);
         company = new Company();
    }

    private static class SINGLETON_HOLDER{
        private static final MenuService INSTANCE = new MenuService();
    }
    public static MenuService getInstance(){
        return SINGLETON_HOLDER.INSTANCE;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void warehouseMenu(int index){
        while(true) {
            System.out.println("Selectati optiunea: ");
            System.out.println("1. Vizualizare date despre depozit");
            System.out.println("2. Adaugare vehicul");
            System.out.println("3. Intoarcere la meniul principal");
            Warehouse warehouse = company.getWarehouse(index);
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println(warehouse.getWarehouseInformation());
                    System.out.println("Apasati orice tasta pentru a va intoarce la meniul principal");
                    String garbage = scanner.next();
                    this.mainMenu();
                    break;
                case 2:
//                    System.out.println("1 pentru Agent de vanzari, 2 pentru sofer:");
//                    int type = scanner.nextInt();
//                    System.out.println("Introduceti numele angajatului: ");
//                    String name = scanner.next();
//                    System.out.println("Introduceti categoria de permis a angajatului: ");
//                    String driversLicence = scanner.next();
//                    System.out.println("Introduceti data de angajare: ");
//                    String date = scanner.next();
//                    System.out.println("Introduceti nr de telefon al angajatului: ");
//                    String phone = scanner.next();
//                    System.out.println("Introduceti varsta angajatului: ");
//                    int age = scanner.nextInt();
//                    if( type == 1 ){
//                        Employee.Employee e = new Employee.Salesperson(name, driversLicence, date, phone, age);
//                    }
//                    else{
//                        Employee.Employee e = new Employee.Driver(name, driversLicence, date, phone, age);
//                    }
                    System.out.println("1 pentru autoturism, 2 pentru duba:");
                    int type = scanner.nextInt();
                    System.out.println("Introduceti numarul de inmatriculare: ");
                    String plate = scanner.next();
                    System.out.println("Introduceti modelul: ");
                    String model = scanner.next();
                    System.out.println("Introduceti nr de kilometri: ");
                    int mileage = scanner.nextInt();
                    System.out.println("Introduceti categoria masinii: ");
                    String licenseRequirement = scanner.next();
                    System.out.println("Introduceti sarcina maxima a masinii: ");
                    int maxLoad = scanner.nextInt();
                    Vehicle v;
                    if( type == 1 ){
                        v = new Sedan(plate, model, mileage, licenseRequirement, maxLoad);
                    }
                    else{
                        v = new Van(plate, model, mileage, licenseRequirement, maxLoad);
                    }
                    warehouse.addVehicle(v);
                    System.out.println("Vehicul adaugat. Apasati orice tasta pentru a va intoarce la meniul principal.");
                    garbage = scanner.next();
                    this.mainMenu();
                    break;
                case 3:
                    this.mainMenu();
                    break;
            }

        }
    }

    public void mainMenu(){
        while(true){
            System.out.println(company.getName());
            System.out.println("Selectati depozitul pe care doriti sa faceti modificari: ");
            System.out.println(company.printWarehouses());
            int indexDepozit = scanner.nextInt() - 1;
            this.warehouseMenu(indexDepozit);
            break;
        }
    }
}
