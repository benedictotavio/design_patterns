package patterns.comportamental.chain_of_responsability.middlewares;

import patterns.comportamental.chain_of_responsability.server.Server;

public class CheckUserMiddleware extends Middleware{

    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }


    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("E-Mail invalid!");
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("E-Mail or password is incorrect!");
            return false;
        }
        return checkNext(email, password);
    }

}
