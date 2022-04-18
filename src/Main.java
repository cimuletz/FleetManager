public class Main {
    public static void main(String[] args) {
        Company company;
        Factory factory = Factory.getInstance();
        MenuService menu = MenuService.getInstance();
        company = factory.getCompany();
        menu.setCompany(company);
        menu.mainMenu();
    }
}
