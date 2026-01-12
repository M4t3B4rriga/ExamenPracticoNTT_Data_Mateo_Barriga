package com.qa.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;

public class FinishPage extends PageObject {

    @FindBy(id = "finish")
    WebElementFacade finishButton;

    @FindBy(className = "complete-header")
    WebElementFacade confirmationMessage;

    public void finishPurchase() {
        finishButton.click();
    }

    public void validateConfirmation() {
        Assertions.assertThat(confirmationMessage.getText())
                .isEqualTo("THANK YOU FOR YOUR ORDER");
    }
}
