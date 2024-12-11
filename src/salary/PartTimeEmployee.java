package salary;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours){
        super(name, paymentPerHour);
        this.workingHours = workingHours;
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
