package com.qa.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    WebElementFacade firstName;

    @FindBy(id = "last-name")
    WebElementFacade lastName;

    @FindBy(id = "postal-code")
    WebElementFacade postalCode;

    @FindBy(id = "continue")
    WebElementFacade continueButton;

    public void fillForm() {
        firstName.type("Sebastian");
        lastName.type("Barriga");
        postalCode.type("0000");
        continueButton.click();
    }
}
