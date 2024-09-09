package co.com.petStore.usersteps;

import co.com.petStore.pageobjects.DetailProductPage;
import co.com.petStore.pageobjects.PetStoreMainPage;
import co.com.petStore.pageobjects.ProductListDetailPage;
import co.com.petStore.pageobjects.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.assertEquals;

public class PetStoreUserStep {

    PetStoreMainPage pagePetStore;
    DetailProductPage userPage;
    ProductListDetailPage user;
    ShoppingCartPage userShopping;

    @Step("open page main petStore")
    public void openPageMainPetStore() {
        pagePetStore.open();
    }

    @Step("search product")
    public void searchProduct(String nameProduct) {
       pagePetStore.searchProduct(nameProduct);
       userPage.chooseProduct();
    }

    @Step("user add the shopping cart")
    public void userAddTheShoppingCart() {
        user.addCartProduct();
    }

    @Step("verify product is added to the cart")
    public void verifyProductIsAddedToTheCart(String data) {
        String textCurrent = userShopping.verifyNameProduct();
        assertEquals("Product text doesn't match what you expect", textCurrent, data);
    }

    @Step("Delete product in cart shopping")
    public void deleteProductCart(){
        user.deleteProduct();
    }

    @Step("verify delete product in cart shopping")
    public void verifyDeleteProduct(String data) {
        String textCurrent = userShopping.verifyCartEmpty();
        assertEquals("Product text doesn't match what you expect", textCurrent, data);
    }
}
