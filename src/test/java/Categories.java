import org.example.NavigateThroughCategoriesPageObjects;
import org.testng.annotations.Test;

public class Categories extends BaseTest{

    @Test
    public void categoryTest(){
        NavigateThroughCategoriesPageObjects categoryPage = new NavigateThroughCategoriesPageObjects(driver);
        categoryPage.navbarElectronics();
    }
}
