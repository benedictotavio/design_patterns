package patterns.structure.adapter.adapters;

import patterns.structure.adapter.marcado_pago.IMercadoPagoPayments;
import patterns.structure.adapter.marcado_pago.MercadoPago;
import patterns.structure.adapter.payoneer.Payoneer;
import patterns.structure.adapter.paypal.IPayPalPayments;
import patterns.structure.adapter.utils.Token;

public class PayoneerToPayPalAdapter implements IPayPalPayments {

    private Token token;
    private final Payoneer payoneer;

    public PayoneerToPayPalAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando Payoneer com os metodos do Paypal.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
