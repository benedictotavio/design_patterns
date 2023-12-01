package solid.dependency_inversion;

import solid.dependency_inversion.payment.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("2wp12d");
    }
}
