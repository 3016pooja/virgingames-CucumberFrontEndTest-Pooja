package com.virgingames.pages;


import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement casino ;
    //body/div[@id='app']/div[@id='styledApp']/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),' Accept')]")
    WebElement cookies ;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/a[1]/div[1]/canvas[1]")
    WebElement jointnow ;

    public void clickOncasino() {
       log.info("Clicking on casino " + casino.getText() + "<br>");
        clickOnElement(casino);
    }

    public void clickOcookies() {
       log.info("Clicking on accept the cookies : " + cookies.getText() + "<br>");
        clickOnElement(cookies);

    }
    public void clickOjointnow() {
        log.info("Clicking on jointnow button: " + jointnow.getText() + "<br>");
        clickOnElement(jointnow);


    }
}
