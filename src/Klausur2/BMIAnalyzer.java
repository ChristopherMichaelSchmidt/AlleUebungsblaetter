package Klausur2;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{

    private ArrayList<Pair<Person, Double>> result;


    public BMIAnalyzer() {
        result = new ArrayList<>();
    }

    public void addPerson(Pair p){
        result.add(p);

    }


    private double calcBMI(Person p){
        double BMI = (double)p.getWeight()/ (((double)p.getSize() / 100.0) * ((double)p.getSize() / 100.0));
        return BMI;

    }


    @Override
    public void analyze() {
        for(Pair pair : result){
            System.out.println(calcBMI((Person)pair.getKey()));
            Pair p = new Pair(pair.getKey(), calcBMI((Person)pair.getKey()));
            result.add(p);
        }

    }
}
