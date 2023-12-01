package solid.dependency_inversion.payment;

import solid.dependency_inversion.enums.DatabaseType;
import solid.dependency_inversion.factory.DbProductFactory;
import solid.dependency_inversion.model.IDbProduct;

public class Payment {
    public void pay(String productID){
        //    MySQL db = new MySQL();  classe Payment esta acoplada a MySQL
        // String p1 = MySQL.getProductById(productID);
        IDbProduct dbProduct = DbProductFactory.create(DatabaseType.MONGODB);
        System.out.println(dbProduct.getProductById("3j1290eji"));
    }
}
