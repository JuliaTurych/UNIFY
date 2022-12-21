package com.pages;

import com.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class UnifyPOM {
    public Map<String,WebElement> actualMenuTabs;


    public UnifyPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="menu-open")
   public WebElement openMenu;

    public void clickOnMenu(){
        openMenu.click();
    }

}
