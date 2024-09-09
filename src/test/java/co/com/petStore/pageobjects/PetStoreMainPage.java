package co.com.petStore.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class PetStoreMainPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//input[@name='keyword']")
    private WebElement fieldName;

    @FindBy(how = How.XPATH, using = "//input[@name='searchProducts']")
    private WebElement btnSearch;


    public void searchProduct(String name) {
        try {
            fieldName.sendKeys(name);
            btnSearch.click();
        } catch (Exception e) {
            System.err.println("Error when trying to click on the product: " + e.getMessage());
        }
    }
}
