package Ue3;

public class Anlage {

    private String bezeichnung;
    private double initialWert;
    private int nutzungsDauer;
    private double restWert;
    private int alter;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsDauer() {
        return nutzungsDauer;
    }

    public double getRestWert() {
        return restWert;
    }

    public int getAlter() {
        return alter;
    }

    public Anlage(String bezeichnung, double initialWert, int nutzungsDauer) {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsDauer = nutzungsDauer;
        restWert = initialWert;
        alter = 0;
    }
    public void abschreiben(){
        alter++;
        if(alter <= nutzungsDauer){
            restWert = Math.floor(initialWert / nutzungsDauer * (nutzungsDauer - alter));

        }

    }


    @Override
    public String toString() {
        return "Anlage{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", nutzungsDauer=" + nutzungsDauer +
                ", restWert=" + restWert +
                ", alter=" + alter +
                '}';
    }

    public void simulate(int maxJahre, int minWert){
        System.out.println(restWert);
        for(int i =0; i <=maxJahre; i++) {
            if (restWert > 0 && restWert > minWert) {
                abschreiben();
                System.out.println(restWert);
            }
        }



    }
    public Anlage renew(int zusatzWert, int zusatzJahre){
        Anlage hilf = new Anlage(bezeichnung, initialWert+ zusatzWert, nutzungsDauer - alter + zusatzJahre);

return hilf;

    }

}
