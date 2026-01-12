package com.qa.saucedemo.steps;

import net.thucydides.core.annotations.Step;
import com.qa.saucedemo.pages.*;

public class CompraSteps {

    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    FinishPage finishPage;

    @Step("Abrir SauceDemo")
    public void openSauceDemo() {
        loginPage.open();
    }

    @Step("Login")
    public void login() {
        loginPage.openLoginPage();
        loginPage.loginAs("standard_user", "secret_sauce");
    }

    @Step("Agregar producto y ver carrito")
    public void addProductAndGoToCart() {
        productsPage.addProductToCart();
        productsPage.goToCart();
    }

    @Step("Checkout")
    public void checkout() {
        cartPage.checkout();
    }

    @Step("Completar formulario")
    public void fillForm() {
        checkoutPage.fillForm();
    }

    @Step("Finalizar compra")
    public void finishPurchase() {
        finishPage.finishPurchase();
        finishPage.validateConfirmation();
    }
}
