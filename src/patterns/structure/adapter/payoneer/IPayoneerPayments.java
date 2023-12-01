package patterns.structure.adapter.payoneer;

import patterns.structure.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
