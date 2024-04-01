import org.example.RemoveProductPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProduct extends BaseTest {
    @Test
    public void removeProduct() {
        RemoveProductPageObjects remove = new RemoveProductPageObjects(driver);
        remove.setSearch();
        remove.setAddToCartButton();

        Assert.assertEquals(remove.removeItem(), "Your Amazon Cart is empty.");
       
    }
}
