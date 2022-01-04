package Ue7;

public class Bundesland extends  Land{
    private double bruttoSozialProdukt;

    @Override
    public double getBruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

}
