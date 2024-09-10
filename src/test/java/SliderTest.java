import org.example.SignInLocationPageObjects;
import org.example.SliderPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void slider() throws InterruptedException {
        SliderPageObjects sliding = new SliderPageObjects(driver);
        sliding.sliderFlow();
    }

}
