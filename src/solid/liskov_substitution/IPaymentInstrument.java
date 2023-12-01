package solid.liskov_substitution;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}
