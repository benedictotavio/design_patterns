package solid.dependency_inversion.factory;

import solid.dependency_inversion.enums.DatabaseType;
import solid.dependency_inversion.model.IDbProduct;
import solid.dependency_inversion.model.MongoDB;
import solid.dependency_inversion.model.MySQL;

public class DbProductFactory {
    public static IDbProduct create(DatabaseType db){
        if (db.equals(DatabaseType.MYSQL)){
            return new MySQL();
        }else {
            return new MongoDB();
        }
    }
}
