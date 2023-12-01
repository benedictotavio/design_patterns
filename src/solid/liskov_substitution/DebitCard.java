package solid.liskov_substitution;

public class DebitCard extends NubankCard{
    @Override
    public void validate() throws Exception{
        System.out.println("Verfificando saldo");
    }
}
