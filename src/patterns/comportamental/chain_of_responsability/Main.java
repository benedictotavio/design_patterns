package patterns.comportamental.chain_of_responsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import patterns.comportamental.chain_of_responsability.middlewares.CheckPermissionMiddleware;
import patterns.comportamental.chain_of_responsability.middlewares.CheckUserMiddleware;
import patterns.comportamental.chain_of_responsability.middlewares.Middleware;
import patterns.comportamental.chain_of_responsability.server.Server;

class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void main(String[] args) throws IOException {
        init();

        boolean done = true;

        do {
            System.out.print("Email:");
            String email = reader.readLine();
            done = server.logIn(email, email);
        } while (!done);
    }

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "0123");
        server.registerUser("user@hcode.com.br", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
}