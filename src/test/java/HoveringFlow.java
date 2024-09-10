import org.example.HoveringPageObjects;
import org.testng.annotations.Test;

public class HoveringFlow extends BaseTest{
    @Test
    public void hovering() {
HoveringPageObjects hover = new HoveringPageObjects(driver);
hover.hoveringFlow();
    }
}
