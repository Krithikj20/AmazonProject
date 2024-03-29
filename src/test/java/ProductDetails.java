import org.example.ProductDetailsPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetails extends BaseTest{
    @Test
    public void productDetails() {
        ProductDetailsPageObjects details = new ProductDetailsPageObjects(driver);
        details.setSearch();
        details.verifyDetails();
    }
}
