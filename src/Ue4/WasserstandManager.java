package Ue4;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstaende;

    public Wasserstand findById(int id){

            for(Wasserstand wasserstand: wasserstaende){
                if(wasserstand.getId() == id){
                    return wasserstand;
                }

            }

        return null;

    }
    public ArrayList<Wasserstand> findAllByGewaesser(String gewaessername){
        ArrayList<Wasserstand> hilf = new ArrayList<>();
        for(Wasserstand wasserstand: wasserstaende){
            if(wasserstand.getGewaesserName().equals(gewaessername)){
                hilf.add(wasserstand);
            }
        }
            return hilf;

    }


    public Wasserstand findLAstWasserstand(String gewaessername){
        int hilf =0;

        for(Wasserstand wasserstand: wasserstaende) {
            if(wasserstand.getGewaesserName().equals(gewaessername) && hilf < wasserstand.getZeitPunkt()){
                hilf = wasserstand.getZeitPunkt();

            }


        }
        for (Wasserstand wasserstand:wasserstaende){
            if(wasserstand.getGewaesserName().equals(gewaessername) && hilf == wasserstand.getZeitPunkt()){
                return wasserstand;
            }

        }
        return null;


    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> hilf = new ArrayList<>();
        for(Wasserstand wasserstand: wasserstaende){
            if(wasserstand.getMessWert()<=wasserstand.getMessWertFuerAlarmierung()){
                hilf.add(wasserstand);

            }
        }

        return hilf;


    }


    public double calcMittlererWasserstand(String gewaessername){
        double hilf = 0.0;
        int count=0;
        for(Wasserstand wasserstand: wasserstaende){
            if(wasserstand.getGewaesserName().equals(gewaessername) ){
                hilf =  hilf + wasserstand.getMessWert();
                count++;
            }
        }
        return hilf/ (double) count;




    }


    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaessername){
        ArrayList<Wasserstand> hilf = new ArrayList<>();
        for(Wasserstand wasserstand: wasserstaende){
            if(wasserstand.getGewaesserName().equals(gewaessername) && wasserstand.getZeitPunkt()>=von && wasserstand.getZeitPunkt()<=bis){
                hilf.add(wasserstand);


            }


        }

    return hilf;


    }










}
