package Klausur2;

import java.util.ArrayList;

public class Demo {


    public static void main(String[] args) {
        Person test = new Person("chris", "schmidt", 'm', 32, "aut", 0.0, "blau, ", 100, 190);

        Pair p = new Pair(test, 100.0);

     BMIAnalyzer bmi = new BMIAnalyzer();

     bmi.addPerson(p);

        bmi.analyze();

    }
}
