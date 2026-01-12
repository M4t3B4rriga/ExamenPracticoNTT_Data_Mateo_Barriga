package com.qa.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    public void openLoginPage() {
        openAt("https://www.saucedemo.com/");
    }

    public void loginAs(String user, String pass) {
        username.waitUntilVisible().type(user);
        password.type(pass);
        loginButton.click();
    }
}
