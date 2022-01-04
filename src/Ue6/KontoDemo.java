package Ue6;

public class KontoDemo {

    public static void main(String[] args) {
         Konto k = new Konto("Schmidt");

      /*  System.out.println(k);
        k.einzahlen(1000);
        System.out.println(k);
        k.auszahlen(200);
        System.out.println(k);*/


      /*  Girokonto g  = new Girokonto("Mussger", 500);
        g.einzahlen(600);
        g.auszahlen(700);
        System.out.println(g);
        g.auszahlen(400);
        System.out.println(g); */


     /*   JugendGirokonto j = new JugendGirokonto("Marc", 100, 200);
        j.einzahlen(200);
        j.auszahlen(200);
        System.out.println(j);
        j.auszahlen(100);
        System.out.println(j); */


        Sparkonto s = new Sparkonto("Sorglos");
        s.einzahlen(100);
        System.out.println(s);
        s.auszahlen(101);
        System.out.println(s);
        s.auszahlen(99);
        System.out.println(s);


    }

}
