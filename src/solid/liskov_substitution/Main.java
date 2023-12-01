package solid.liskov_substitution;

public class Main {
    public static void main(String[] args) throws Exception {
        // CreditCard card1 = new CreditCard();
//        card1.validate();
//        card1.collectPayment();

        System.out.println("----------------------");

        // DebitCard card2 = new DebitCard();
//        card2.validate();
//        card2.collectPayment();

        NubankReward card3 = new NubankReward();
        card3.validate();
        card3.collectPayment(); // os métodos se mantem funcionando, pois são orientados a Interface
    }
}
