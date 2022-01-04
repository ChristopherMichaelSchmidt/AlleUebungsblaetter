package Ue6;

public class FixCommissionEmployee extends Employee{

    private double additionalCommission;

    public FixCommissionEmployee(String firstName, String lastName, String department, double baseSalary, double additionalCommission) {
        super(firstName, lastName, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullSalary() {

        double hilf = baseSalary + additionalCommission;
        return hilf;



    }



}
