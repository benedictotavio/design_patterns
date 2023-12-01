package patterns.structure.adapter;

import patterns.structure.adapter.adapters.PayoneerToMercadoPago;
import patterns.structure.adapter.adapters.PayoneerToPayPalAdapter;
import patterns.structure.adapter.marcado_pago.IMercadoPagoPayments;
import patterns.structure.adapter.marcado_pago.MercadoPago;
import patterns.structure.adapter.payoneer.IPayoneerPayments;
import patterns.structure.adapter.payoneer.Payoneer;
import patterns.structure.adapter.paypal.IPayPalPayments;
import patterns.structure.adapter.utils.Token;

public class Main {
    public static void main(String[] args) {
        IPayoneerPayments payment = new Payoneer();

        IPayPalPayments payment2 = new PayoneerToPayPalAdapter(new Payoneer());

        IMercadoPagoPayments payment3 = new PayoneerToMercadoPago(new MercadoPago());

        System.out.println("--------- Payoneer ---------");

        payment.sendPayment();
        payment.receivePayment();

        System.out.println("--------- PayPal ---------");

        payment2.paypalPayment();
        payment2.paypalReceive();

        System.out.println("--------- MercadoPago ---------");
        payment3.mercadoPagoPayment();
        payment3.mercadoPagoReceivement();
    }
}
