// interface contain all abstract method so no need of writing abstarct inside the interface. instead of extends we can write implements.

// Abstract class defining the basic structure
abstract class Payment {
    abstract void processPayment(double amount);
    
    void transactionDetails() { // Concrete method (not abstract)
        System.out.println("Transaction Successful!");
    }
}

// Interface ensuring all payments have validation
interface PaymentValidation {
    boolean validatePaymentDetails();
}

// CreditCard class implements abstraction via inheritance and interface
class CreditCardPayment extends Payment implements PaymentValidation {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Credit Card details...");
        return true; // Assuming validation is successful
    }
}

// PayPal class demonstrating abstraction in a different way
class PayPalPayment extends Payment implements PaymentValidation {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating PayPal account...");
        return true; 
    }
}

// Main method to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        PaymentValidation creditValidation = new CreditCardPayment();
        
        if (creditValidation.validatePaymentDetails()) {
            creditCard.processPayment(150.75);
            creditCard.transactionDetails();
        }
        
        Payment payPal = new PayPalPayment();
        PaymentValidation payPalValidation = new PayPalPayment();
        
        if (payPalValidation.validatePaymentDetails()) {
            payPal.processPayment(200.50);
            payPal.transactionDetails();
        }
    }
}