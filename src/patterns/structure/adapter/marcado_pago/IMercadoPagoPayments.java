package patterns.structure.adapter.marcado_pago;

import patterns.structure.adapter.utils.Token;

public interface IMercadoPagoPayments {
    String checkStatus();
    void mercadoPagoPayment();
    void mercadoPagoReceivement();
    Token authToken();
}
