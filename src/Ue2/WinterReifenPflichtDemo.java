package Ue2;

public class WinterReifenPflichtDemo {
    public static void main(String[] args) {


        System.out.println(isWinterreifenPflicht(3, false));
        System.out.println(isWinterreifenPflicht(11, false));


    }



    public static boolean isWinterreifenPflicht(int temeperatur, boolean rutschigeFahrbahn){
        boolean hilf = false;
        if(temeperatur<10 && rutschigeFahrbahn == true){
            hilf = true;
            System.out.println("Winterreifen");
        }
        else if(temeperatur<4){
            hilf = true;
            System.out.println("Winterreifen");
        }
        if(hilf == false){
            System.out.println("keine Winterreifen");
        }
        return hilf;

    }


}
