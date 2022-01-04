package Ue6;

public class JugendGirokonto extends  Girokonto{
    private double buchungsLimit;

    public JugendGirokonto(String inhaber, double limit, double buchungsLimit) {
        super(inhaber, limit);
        this.buchungsLimit = buchungsLimit;
    }

    @Override
    public void auszahlen(double wert) {
        if(kontoStand - wert >= 0 - limit && wert <=buchungsLimit) {
            kontoStand = kontoStand -wert;
        }

    }
}
