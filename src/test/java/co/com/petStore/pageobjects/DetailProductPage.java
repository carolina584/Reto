package co.com.petStore.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class DetailProductPage extends PageObject {

       @FindBy(how = How.XPATH, using = "(//a[@href='/actions/Catalog.action?viewProduct=&productId=K9-BD-01'])[1]")
       private WebElement selectProductID;

       public void chooseProduct() {
           try {
               selectProductID.click();
           } catch (Exception e) {
               System.err.println("Error when trying to click on the product: " + e.getMessage());
           }
    }
}


