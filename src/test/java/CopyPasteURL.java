import org.example.CopypasteUrlPageobjects;
import org.example.NavigateThroughCategoriesPageObjects;
import org.testng.annotations.Test;

public class CopyPasteURL extends BaseTest{

    @Test
    public void copypasteFlow(){
        CopypasteUrlPageobjects copypaste = new CopypasteUrlPageobjects(driver);
copypaste.test();
    }
}
