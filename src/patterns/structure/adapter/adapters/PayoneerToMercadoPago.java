package patterns.structure.adapter.adapters;

import patterns.structure.adapter.marcado_pago.IMercadoPagoPayments;
import patterns.structure.adapter.marcado_pago.MercadoPago;
import patterns.structure.adapter.payoneer.Payoneer;
import patterns.structure.adapter.utils.Token;

public class PayoneerToMercadoPago implements IMercadoPagoPayments {

    private Token token;
    private final MercadoPago mercadoPago;

    public PayoneerToMercadoPago(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando Payoneer com os metodos do Mercado Pago.");
    }

    @Override
    public String checkStatus() {
        return this.mercadoPago.checkStatus();
    }

    @Override
    public void mercadoPagoPayment() {
        this.mercadoPago.mercadoPagoPayment();
    }

    @Override
    public void mercadoPagoReceivement() {
        this.mercadoPago.mercadoPagoReceivement();
    }

    @Override
    public Token authToken() {
        return this.authToken();
    }
}
