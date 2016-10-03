package uk.co.automatictester.jwebfwk.page.objects;
 
import org.openqa.selenium.WebDriver;
import uk.co.automatictester.jwebfwk.framework.ParentPage;
 
public class MainPage extends ParentPage {
 
    public MainPage(WebDriver driver) {
        super(driver);
    }
 
    public void clickTab(String tab) {
        click(tab);
    }
 
}