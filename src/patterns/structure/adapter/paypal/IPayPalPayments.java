package patterns.structure.adapter.paypal;

import patterns.structure.adapter.utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
