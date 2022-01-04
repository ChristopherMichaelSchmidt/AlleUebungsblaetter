package Ue1;

public class ZinsDemo {

    public static void main(String[] args) {
        double kontostand = 1000.0;
        double zinsen = 0.025 ;

        double kontostandNachAblkauf = kontostand + (kontostand*zinsen);

        System.out.println(zinsBerechnung(5000, 0.5));
    }
    public static double zinsBerechnung(double kontostand, double zinsen){
        double hilf = kontostand + (kontostand*zinsen);
        return hilf;
    }
}
