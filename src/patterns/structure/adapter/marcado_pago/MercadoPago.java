package patterns.structure.adapter.marcado_pago;

import patterns.structure.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public String checkStatus() {
        return authToken().getToken() != null ? "Cliente autenticado" : "Falha na autenticação!";
    }

    @Override
    public void mercadoPagoPayment() {
        System.out.println(checkStatus());
        System.out.println("Pagamento realizado.");
    }

    @Override
    public void mercadoPagoReceivement() {
        System.out.println("Pagamento recebido.");
    }
}
