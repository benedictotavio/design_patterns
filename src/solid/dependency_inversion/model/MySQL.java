package solid.dependency_inversion.model;

public class MySQL implements IDbProduct {
    public String getProductById(String id){
        return "Product #%s - T-shirt Hering".formatted(id);
    }
}
