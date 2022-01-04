package Ue3;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println(personen+name);
        for(int i=0;i<zutaten.length;i++){
            System.out.println(zutaten[i].toString());
        }
    }
    public Rezept umrechen(int personenneu){
        Rezept hilf = new Rezept(name, personenneu, zutaten);
        for(int i =0;i<zutaten.length;i++){
            if(personen<personenneu){
               hilf.zutaten[i].setMenge(zutaten[i].getMenge()*(personenneu/personen));}
            else hilf.zutaten[i].setMenge(zutaten[i].getMenge()*(personen/personenneu));


        }
        return hilf;


    }

}
