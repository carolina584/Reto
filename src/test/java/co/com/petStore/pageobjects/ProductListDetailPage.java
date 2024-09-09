package co.com.petStore.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductListDetailPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-6']")
    private WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//*[@href='/actions/Cart.action?removeItemFromCart=&workingItemId=EST-6']")
    private WebElement delete;

    public void addCartProduct() {
        try {
            addToCart.click();
        } catch (Exception e) {
            System.err.println("Error when trying to click on the product: " + e.getMessage());
        }
    }

    public void deleteProduct() {
        try {
            delete.click();
        } catch (Exception e) {
            System.err.println("Error when trying to click on the product: " + e.getMessage());
        }
    }
}
