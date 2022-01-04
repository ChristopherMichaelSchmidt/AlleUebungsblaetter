package Klausur1;

public class OrtDemo {

    public static void main(String[] args) {



        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort ("linz");
        graz.addNachbar(marburg);
        graz.addNachbar(wien);
        wien.addNachbar(linz);
        linz.addNachbar(graz);
        marburg.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);








    }
    public static boolean hasCircle(Ort o){
    for(Ort ort :o.getNachbarn()){

        if(ort == o){

            return true;
        }

        else hasCircle(ort);



        }

        return false;

    }

    public static int countHops(Ort o, Ort d, int count){
        for(Ort ort: o.getNachbarn()){
            if(ort == d){
                count++;
                return count;
            }
            else count++;
            return countHops(ort, d, count+1);
        }
        return  0;
    }
}
