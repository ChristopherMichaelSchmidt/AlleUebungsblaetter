package Ue2;

public class TurmDemo {
    public static void main(String[] args) {
        int ergebnis = 0;
        int multiplikator = 2;
        for (int i = 2; i<10; i++){
            ergebnis = multiplikator *i;
            multiplikator = ergebnis;
            System.out.println(ergebnis);


        }

        int ergebnis2;
        for (int i =9; i>1;i--){
            ergebnis2 = ergebnis/i;
            ergebnis= ergebnis2;
            System.out.println(ergebnis2);


        }



    }






}
