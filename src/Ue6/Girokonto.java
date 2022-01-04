package Ue6;

public class Girokonto extends Konto{

    protected double limit;

    public Girokonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void auszahlen(double wert) {
        if(kontoStand - wert >= 0 - limit) {
            kontoStand = kontoStand -wert;
        }

    }














}
