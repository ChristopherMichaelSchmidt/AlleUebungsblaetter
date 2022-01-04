package Klausur2;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> persons;

    public PersonManager() {
        persons = new ArrayList<>();
    }



    public void add(Person p){
        persons.add(p);


    }

    public void doAnalysis(PersonAnalyzer a){
        a.setPersons(persons);
        a.analyze();

    }





}
