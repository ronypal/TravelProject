package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import main.test.java.Utils.BaseTest;
import java.util.List;

public class ElementFetch extends BaseTest{


    public WebElement getWebElement(String identifierType, String identifierValue){
       switch (identifierType){
           case "ID":
               return BaseTest.driver.findElement(By.id(identifierValue));
           case "CSS":
               return BaseTest.driver.findElement(By.cssSelector(identifierValue));
           case "TAGNAME":
               return BaseTest.driver.findElement(By.tagName(identifierValue));
           case "XPATH":
               return BaseTest.driver.findElement(By.xpath(identifierValue));
           case "CLASSNAME":
               return BaseTest.driver.findElement(By.className(identifierValue));
           default:
               return null;
       }
    }
    public List<WebElement> getWebElements(String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            case "CLASSNAME":
                return BaseTest.driver.findElements(By.className(identifierValue));
            default:
                return null;

        }
    }

}
