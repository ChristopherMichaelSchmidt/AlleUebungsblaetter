package Ue3;

public class Mitarbeiter {

    private String vorName;
    private String nachName;
    private int mitarbeiterNummer;
    private double gehalt;
    private int alter;

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setMitarbeiterNummer(int mitarbeiterNummer) {
        this.mitarbeiterNummer = mitarbeiterNummer;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public int getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getAlter() {
        return alter;
    }

    public Mitarbeiter(String vorName, String nachName, double gehalt) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.gehalt = gehalt;


    }
    public double monatsAbrechnung(){
        double hilf = gehalt * 0.8;
        if(hilf>=50001){
            hilf = hilf - ((hilf-50001) *0.6) -( 20000 * 0.45) -( 10000 * 0.32) - (10000*0.2) - ( 10000*0.1);
        }
        else if(hilf>30000){ hilf = hilf - ((hilf -30000)*0.45) - ( 10000 * 0.32) - (10000*0.2) - ( 10000*0.1);
        }
         else if(hilf>20000){hilf = hilf - ((hilf - 20000)*0.32) - (10000*0.2) - ( 10000*0.1);

        }
        else if(hilf >10000){ hilf = hilf -((hilf -10000)*0.2) - ( 10000*0.1);


        }
        else if(hilf<10000){ hilf = hilf *0.9;

        }
        return hilf;
    }

    public double jahresAbrechnung(int monate){

         double jahresGehalt = monatsAbrechnung() * monate;

        return jahresGehalt;

    }













}
