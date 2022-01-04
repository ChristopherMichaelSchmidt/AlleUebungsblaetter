package Klausur2;

import java.util.HashMap;

public class MaxSalaryAnalyzer extends PersonAnalyzer {


    @Override
    public void analyze() {
        double hilf = 0.0;
        for (Person person : getPersons()) {
            if (person.getSalary() > hilf) {
                hilf = person.getSalary();

            }

        }
        for (Person person : getPersons()) {
            if (hilf == person.getSalary()) {
                System.out.println(person);
            }


        }

    }
}



