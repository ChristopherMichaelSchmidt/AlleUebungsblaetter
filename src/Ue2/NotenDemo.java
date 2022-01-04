package Ue2;

public class NotenDemo {
    public static void main(String[] args) {


        System.out.println(getNotenText(51));

    }
    public static String getNotenText(int punkte){
        String hilf="";
        if(punkte>=90){hilf = "Sehr gut";}
        if(punkte>=78){hilf = "Gut";}
        if(punkte>=65){hilf = "Befriedigend";}
        if(punkte>=51){hilf = "Genügend";}
        if(punkte<=50){hilf = "Ungenügend";}

        return hilf;



    }
}
