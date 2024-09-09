import org.example.HandlingdropdownPageObjects;
import org.example.NavigateThroughCategoriesPageObjects;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest {
    @Test
    public void AllTabDropdown(){
        HandlingdropdownPageObjects dropdownTest = new HandlingdropdownPageObjects(driver);
        dropdownTest.dropdownFlow();

    }
}


