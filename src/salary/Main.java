package salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int paymentPerHour = 30000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the information of PartTime Employee:");
        System.out.println("Name:");
        String name1 = sc.nextLine();
        System.out.println("Hours:");
        int h1 = Integer.parseInt(sc.nextLine());
        PartTimeEmployee partTime = new PartTimeEmployee(name1, paymentPerHour, h1);

        System.out.println("Fill the information of FullTime Employee:");
        System.out.println("Name:");
        String name2 = sc.nextLine();
        FullTimeEmployee fullTime = new FullTimeEmployee(name2, paymentPerHour);

        System.out.println("Part-Time Employee Salary: " + partTime.calculateSalary());
        System.out.println("Full-Time Employee Salary: " + fullTime.calculateSalary());
    }
}
