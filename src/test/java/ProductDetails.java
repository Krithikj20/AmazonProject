import org.example.ProductDetailsPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetails extends BaseTest{
    @Test
    public void productSearch() {
        ProductDetailsPageObjects details = new ProductDetailsPageObjects(driver);
        details.setSearch();
    }
    @Test
    public void productVerifyDetails() {
        ProductDetailsPageObjects details = new ProductDetailsPageObjects(driver);
        details.setSearch();
        details.verifyDetails();
    }

    }

