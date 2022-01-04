package Ue3;

import java.util.Arrays;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "nummer='" + nummer + '\'' +
                ", zeilen=" + Arrays.toString(zeilen) +
                '}';
    }
    public void printBestellung(){
        System.out.println(nummer + " "+ Arrays.toString(zeilen) );
    }
    public double getKosten(){

        double hilf = 0.0;
        for (int i=0; i<zeilen.length;i++){
            hilf = hilf + zeilen[i].getKosten();


        }
        return hilf;
    }


}
