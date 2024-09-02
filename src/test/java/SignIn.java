import org.example.RemoveProductPageObjects;
import org.example.SignInLocationPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends BaseTest{
    @Test
    public void SignInFlow() throws InterruptedException {
        SignInLocationPageObjects Signin = new SignInLocationPageObjects(driver);
        Signin.SignInFlow();
        Assert.assertEquals(Signin.SignInFlow(), "Password");

    }
}
