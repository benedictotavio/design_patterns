package solid.liskov_substitution;

public class NubankReward implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        System.out.println("Limite Ok, Rewards Ok");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizado!");
        System.out.println("Pontuação creaditada ");
    }
}
