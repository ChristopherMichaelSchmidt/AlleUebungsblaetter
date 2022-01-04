package Ue7;

public class LandDemo {


    public static void main(String[] args) {


    Bundesland b1 = new Bundesland(400.0);
    Bundesland b2 = new Bundesland(500.0);

    Bundesstaat b3 = new Bundesstaat();
    b3.addLand(b1);
    b3.addLand(b2);
        System.out.println(b3.getBruttoSozialProdukt());







    }
}
