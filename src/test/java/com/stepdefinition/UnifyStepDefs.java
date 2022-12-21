package com.stepdefinition;

import com.pages.UnifyPOM;
import com.utils.ConfigurationReader;
import com.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class UnifyStepDefs {

    WebDriver driver;
    UnifyPOM unifyPOM = new UnifyPOM();
    List <WebElement> actualElements;
    Map<String, WebElement> results= new HashMap<>();

    @Given("User on Unify home page click on menu")
    public void user_on_unify_home_page_click_on_menu() {

        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("unify.url"));
        unifyPOM.clickOnMenu();

    }


    @Then("User see all Tabs from menu")
    public void user_see_all_from_menu(List<String> expectedTabs ) {

        actualElements = driver.findElements(By.xpath("//div[@class='navgrid__menu']/ul/li/a"));

        for(WebElement eachElem : actualElements){
            for(String expElem : expectedTabs){

                if (eachElem.getText().equals(expElem)){
                   results.put(expElem, eachElem);
                }

            }
        }
        System.out.println(results.get("People").getText()+ " = " + results.get("People").isDisplayed());
        Assert.assertTrue(results.get("People").isDisplayed());

        System.out.println(results.get("Careers").getText()+ " = " + results.get("Careers").isDisplayed());
        Assert.assertTrue(results.get("Careers").isDisplayed());

        System.out.println(results.get("Services").getText()+ " = " + results.get("Services").isDisplayed());
        Assert.assertTrue(results.get("Services").isDisplayed());

        System.out.println(results.get("Partnerships").getText()+ " = " + results.get("Partnerships").isDisplayed());
        Assert.assertTrue(results.get("Partnerships").isDisplayed());

        System.out.println(results.get("Insights").getText()+ " = " + results.get("Insights").isDisplayed());
        Assert.assertTrue(results.get("Insights").isDisplayed());

        System.out.println(results.get("News").getText()+ " = " + results.get("News").isDisplayed());
        Assert.assertTrue(results.get("News").isDisplayed());

        System.out.println(results.get("Contact").getText()+ " = " + results.get("Contact").isDisplayed());
        Assert.assertTrue(results.get("Contact").isDisplayed());



    }

    @Then("Click on {string} tab")
    public void clickOnTab(String tab) {
        results.get(tab).click();
    }
}
