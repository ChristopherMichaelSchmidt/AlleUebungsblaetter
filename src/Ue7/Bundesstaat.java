package Ue7;

import java.util.ArrayList;

public class Bundesstaat extends  Land{
    private ArrayList<Land> laender;

    public Bundesstaat() {
       laender = new ArrayList<>();
    }

    @Override
    public double getBruttoSozialProdukt() {
        double hilf = 0.0;
        for (Land land: laender){
            hilf  = hilf + land.getBruttoSozialProdukt();
        }
        return hilf;
    }

    public void addLand(Land l){
        laender.add(l);

    }
}
