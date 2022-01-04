package Klausur1;

public class MaestroPayment extends Payment{

    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double hilf = exchangeToEUR() * 0.0075;

        if(hilf <0.95){

            hilf = 0.95;
        }
        return hilf;



    }

    @Override
    public String toString() {
        return "{Maestro" +
                "cardNumber='" + cardNumber + '\'' +
                "Amount='" + getAmount()+ '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
