package employee;

public abstract class Employee {
    private String name;
    private String driversLicence;
    private String employmentDate;
    private String phone;
    private int age;

    public Employee(String name, String driversLicence, String employmentDate, String phone, int age) {
        this.name = name;
        this.driversLicence = driversLicence;
        this.employmentDate = employmentDate;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getDrivingTimeLeft();
    public abstract String getPrintable();

}
