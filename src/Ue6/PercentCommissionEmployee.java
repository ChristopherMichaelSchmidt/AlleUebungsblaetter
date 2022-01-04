package Ue6;

public class PercentCommissionEmployee extends Employee {
    private double percentCommission;

    public PercentCommissionEmployee(String firstName, String lastName, String department, double baseSalary, double percentCommission) {
        super(firstName, lastName, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        double hilf = baseSalary +(baseSalary*percentCommission);
        return hilf;



    }
}
