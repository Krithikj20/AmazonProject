import org.example.AddToCartPageObjects;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {
    @Test
    public void Search() {
        AddToCartPageObjects Searching = new AddToCartPageObjects(driver);
        Searching.setSearch();
        Searching.sort();
        Searching.setAddToCartButton();

    }
}
