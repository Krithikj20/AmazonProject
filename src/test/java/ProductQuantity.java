import org.example.ProductDetailsPageObjects;
import org.example.ProductQuantityPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductQuantity extends BaseTest {
    @Test
    public void IncreaseQuantity() throws InterruptedException {
        ProductQuantityPageObjects Quantity = new ProductQuantityPageObjects(driver);
        Quantity.setSearch();
        Quantity.setAddToCartButton();
        Assert.assertEquals(Quantity.setQuantity(), "2");
    }
}
