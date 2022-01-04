package Ue3;

public class RezeptDemo {
    public static void main(String[] args) {
        Zutat z1 = new Zutat("Zucker", 20);
        Zutat z2 = new Zutat("Zimt", 5);

        Zutat[] array = {z1, z2};

        Rezept r1 = new Rezept("Milchreis", 2, array);

        System.out.println(r1);




    }
}
