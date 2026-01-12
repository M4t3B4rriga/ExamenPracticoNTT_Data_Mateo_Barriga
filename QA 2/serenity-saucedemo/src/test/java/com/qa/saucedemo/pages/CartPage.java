package com.qa.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(id = "checkout")
    WebElementFacade checkoutButton;

    public void checkout() {
        checkoutButton.waitUntilClickable().click();
    }
}
