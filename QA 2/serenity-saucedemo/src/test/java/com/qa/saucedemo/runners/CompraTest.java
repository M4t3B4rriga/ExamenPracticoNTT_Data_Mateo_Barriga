package com.qa.saucedemo.runners;

import com.qa.saucedemo.steps.CompraSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CompraTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    CompraSteps compraSteps;

    @Test
    public void compraExitosa() {
        compraSteps.login();
    }
}
