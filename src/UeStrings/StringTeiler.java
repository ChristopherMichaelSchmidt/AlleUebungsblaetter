package UeStrings;

import java.util.Locale;

public class StringTeiler {
    public static void main(String[] args) {
        String test = "Der weg ist das ziel";
        System.out.println(großBuchstabenNachLeerzeichen(test));

    }


    public static String großBuchstabenNachLeerzeichen(String s){
        String[] hilf = s.split(" ");
        for(int i=0; i<hilf.length;i++){
            hilf[i] = Character.toUpperCase(hilf[i].charAt(0)) + hilf[i].substring(1);


        }

        String zusammensetzen = "";
        for(int i =0; i< hilf.length; i++){
            zusammensetzen = zusammensetzen +" "+ hilf[i];


        }
        return zusammensetzen;


    }



}
