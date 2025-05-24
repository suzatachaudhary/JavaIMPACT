interface Payment {
    void processPayment(double amount); // Abstract method (no implementation)
}

// Implementing the interface in CreditCardPayment
class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}

// Implementing the interface in PayPalPayment
class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        creditCard.processPayment(150.75);  // Output: "Processing Credit Card Payment of $150.75"
        
        Payment payPal = new PayPalPayment();
        payPal.processPayment(200.50);  // Output: "Processing PayPal Payment of $200.50"
    }
}