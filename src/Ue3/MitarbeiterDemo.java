package Ue3;

public class MitarbeiterDemo {
    public static void main(String[] args) {

        Mitarbeiter m1 = new Mitarbeiter("Susi", "Sorglos", 2500.0);
        Mitarbeiter m2 = new Mitarbeiter("Max", "Mustermann", 50002);


        System.out.println(m1.monatsAbrechnung());
        System.out.println(m2.monatsAbrechnung());


    }
}
