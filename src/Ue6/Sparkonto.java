package Ue6;

public class Sparkonto extends Konto{
    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        if(kontoStand-wert>0){
            kontoStand = kontoStand -wert;
        }



    }




}
