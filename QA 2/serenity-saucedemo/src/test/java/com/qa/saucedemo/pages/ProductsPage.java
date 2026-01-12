
package com.qa.saucedemo.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class ProductsPage extends PageObject {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElementFacade backpack;

    @FindBy(className = "shopping_cart_link")
    WebElementFacade cartButton;


     public void addProductToCart() {
        backpack.waitUntilClickable().click();
    }

    public void goToCart() {
        cartButton.click();
    }
}
