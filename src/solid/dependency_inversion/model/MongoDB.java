package solid.dependency_inversion.model;

public class MongoDB implements IDbProduct{
    public String getProductById(String id){
        return "Product #%s - T-shirt Nike".formatted(id);
    }
}
