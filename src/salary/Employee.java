package salary;

abstract class Employee implements IEmployee{
    protected String name;
    protected int paymentPerHour;

    public Employee(String name, int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public abstract int calculateSalary();
}
