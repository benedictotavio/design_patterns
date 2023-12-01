package patterns.comportamental.chain_of_responsability.middlewares;

public class CheckPermissionMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@hcode.com.br")) {
            System.out.println("Welcome Admin");
            return true;
        }
        System.out.println("Welcome");
        return checkNext(email, password);
    }
    
}
