import Utils.Actions;
import org.example.ProductDetailsPageObjects;
import org.example.ScrollToProductReviewPageObjects;
import org.testng.annotations.Test;

public class ProductReviewPage extends BaseTest {

    @Test
    public void ProductReview() throws InterruptedException {
        ProductDetailsPageObjects details = new ProductDetailsPageObjects(driver);
        details.setSearch();

        ScrollToProductReviewPageObjects review=new ScrollToProductReviewPageObjects(driver);
        review.customerReview();
    }
}
