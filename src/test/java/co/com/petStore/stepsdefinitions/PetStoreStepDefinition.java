package co.com.petStore.stepsdefinitions;

import co.com.petStore.usersteps.PetStoreUserStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetStoreStepDefinition {

    @Steps
    PetStoreUserStep pageUser;

    @Given("user is in the app petStore")
    public void userIsInTheAppPetStore() {
        pageUser.openPageMainPetStore();
    }

    @And("search for (.*) product")
    public void searchForNameProduct(String data) {
        pageUser.searchProduct(data);
    }

    @When("user add the shopping cart")
    public void userSearchesProductNameAndAddTheShoppingCart() {
        pageUser.userAddTheShoppingCart();
    }

    @Then("verify product is added to the cart (.*)")
    public void verifyProductIsAddedToTheCartDescription(String data) {
        pageUser.verifyProductIsAddedToTheCart(data);
    }

    @When("search for (.*) product in cart")
    public void searchForNameProductInCart(String name) {
        pageUser.searchProduct(name);
    }

    @And("add the shopping cart and delete")
    public void addTheShoppingCartAndDelete() {
        pageUser.userAddTheShoppingCart();
        pageUser.deleteProductCart();
    }

    @Then("verify message (.*)")
    public void verifyMessageDescription(String data) {
        pageUser.verifyDeleteProduct(data);
    }
}
