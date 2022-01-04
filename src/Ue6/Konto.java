package Ue6;

public class Konto {
    protected String inhaber;
    protected double kontoStand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontoStand=0.0;
    }


    public void einzahlen(double wert){
        kontoStand = kontoStand +wert;

    }

    public void auszahlen(double wert){
        kontoStand = kontoStand -wert;


    }


    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontoStand=" + kontoStand +
                '}';
    }
}
