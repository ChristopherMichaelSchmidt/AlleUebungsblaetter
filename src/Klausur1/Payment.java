package Klausur1;

public abstract class Payment {

    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }


    public abstract double calcTransactionCosts();



    public double exchangeToEUR(){
        double hilf = 0.0;

        switch(currency){
            case "USD": hilf = amount * (1/1.1);
            break;
            case "GBP": hilf = amount * (1/0.85);
            break;
            case "SEK": hilf = amount * (1/9.5);
            break;
            case "HUF": hilf = amount * (1/310.0);
            break;
            case"EUR": hilf = amount;
            default: hilf = amount * (1/2.0);


        }
        return hilf;





    }
















}
