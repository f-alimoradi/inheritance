import payment.*;

public class Main {
    public static void main(String[] args) {
    Customer luke = new RegularCustomer("Luke");
    Customer leia = new RegularCustomer("Leia");
    Customer yoda = new PremiumCustomer("Yoda");

    PayPalPayment payPalPayment = new PayPalPayment("LukeSkywalker@gmail.com");
    CreditCardPayment creditCardPayment = new CreditCardPayment("123456789", "Leia");
    BitcoinPayment bitcoinPayment = new BitcoinPayment("MayTheForceBeWithYou");

    luke.displayCustomerInfo();
    leia.displayCustomerInfo();
    yoda.displayCustomerInfo();

    luke.makePayment(payPalPayment,25);
    luke.makePayment(payPalPayment,45);
    leia.makePayment(creditCardPayment,90);
    leia.makePayment(creditCardPayment, 120);
    yoda.makePayment(bitcoinPayment, 470);
    yoda.makePayment(bitcoinPayment, 300);
    }
}