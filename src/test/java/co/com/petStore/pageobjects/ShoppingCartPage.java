package co.com.petStore.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id='Cart']/form/table/tbody/tr[2]/td[3]")
    private WebElement descriptionProduct;

    public String verifyNameProduct() {
        return descriptionProduct.getText();
    }
}
