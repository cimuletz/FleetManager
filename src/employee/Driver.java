package employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Driver extends Employee {
    public Driver(String name, String driversLicence, String employmentDate, String phone, int age) {
        super(name, driversLicence, employmentDate, phone, age);
    }

    @Override
    public int getDrivingTimeLeft() {
        DateTimeFormatter day = DateTimeFormatter.ofPattern("EEE");
        DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter minute = DateTimeFormatter.ofPattern("mm");
        String currentDay = day.format(LocalDateTime.now());
        int currentHour = Integer.parseInt(hour.format(LocalDateTime.now()));
        int currentMinute = Integer.parseInt(minute.format(LocalDateTime.now()));
        int minutesLeft = 0;
        if(currentDay.equals("Sat") || currentDay.equals("Sun")){
            return 0;
        }
        if( currentHour < 17 && currentHour >= 8){
            minutesLeft = (17 - currentHour) * 60;
            minutesLeft -= currentMinute;
        }
        minutesLeft -= (minutesLeft/60)*10 + (minutesLeft/240)*30;
        return minutesLeft;
    }

    @Override
    public String getPrintable() {
        return "Employee.Driver: " + this.getName() + " " + this.getPhone() + "\n";
    }
}
