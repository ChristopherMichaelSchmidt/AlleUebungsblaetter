package Ue3;

public class BestellDemo {
    public static void main(String[] args) {

        Bestellzeile b1 = new Bestellzeile("Schrauben", 100, 2);
        Bestellzeile b2 = new Bestellzeile("Nägel", 320, 5);

       // System.out.println(b1.getKosten());

        Bestellzeile[] array = {b1, b2};

        Bestellung b3 = new Bestellung("2529582", array);

        System.out.println(b3.getKosten());





    }


}
