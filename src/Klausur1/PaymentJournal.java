package Klausur1;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> liste;

    public PaymentJournal() {
        liste = new ArrayList<>();
    }


    public void add(Payment p){

        liste.add(p);


    }


    public double totalTransactionCosts(){

        double hilf = 0.0;
        for(Payment payment: liste){
            hilf = hilf + payment.calcTransactionCosts();


        }

        return hilf;
    }


    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> hilf = new HashMap<>();
        for(Payment payment: liste){
            if(hilf.containsKey(payment.getCurrency())){
                double temp = hilf.get(payment.getCurrency()) + 1;
                hilf.put(payment.getCurrency(), temp);

            }
            else hilf.put(payment.getCurrency(), 1.0);

        }


    return hilf;


    }





}
