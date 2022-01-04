package Klausur1;

import java.util.ArrayList;

public class Ort {
    private String name;
    ArrayList<Ort> nachbarn;

    public String getName() {
        return name;
    }

    public ArrayList<Ort> getNachbarn() {
        return nachbarn;
    }

    public Ort(String name) {
        this.name = name;
        nachbarn = new ArrayList<>();
    }

    public void addNachbar(Ort o){
        nachbarn.add(o);



    }





}
