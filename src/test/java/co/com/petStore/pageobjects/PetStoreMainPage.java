package co.com.petStore.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class PetStoreMainPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//*[@id='SearchContent']/form/input[1]")
    private WebElement fieldName;

    @FindBy(how = How.XPATH, using = "//input[@name='searchProducts']")
    private WebElement buttonSearch;


    public void searchProduct(String name) {
        try {
            fieldName.sendKeys(name);
            buttonSearch.click();
        } catch (Exception e) {
            System.err.println("Error when trying to click on the product: " + e.getMessage());
        }
    }
}
