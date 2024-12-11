package salary;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        int workingDays = 22;
        int dailyHours = 8;
        return paymentPerHour * dailyHours * workingDays;
    }
}
