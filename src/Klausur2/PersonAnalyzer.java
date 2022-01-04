package Klausur2;

import java.util.ArrayList;

public abstract class PersonAnalyzer {

    private ArrayList<Person> persons;

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public PersonAnalyzer() {
        persons  = new ArrayList<>();
    }

    public abstract  void analyze();

}
