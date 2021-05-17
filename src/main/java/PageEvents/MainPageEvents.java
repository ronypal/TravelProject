package PageEvents;

import PageObjects.MainPageElements;
import Utils.BaseTest;
import Utils.ElementFetch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.sql.Driver;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.ListIterator;

public class MainPageEvents extends BaseTest {
    private static final int MILLIS = 2000;
    private static final int SECONDS = 2000;
    ElementFetch elementFetch = new ElementFetch();
    private WebElement WebElementdisplay;

    public void clickOnSearchBox() {
        elementFetch.getWebElement("ID", MainPageElements.searchBox).click();
    }

    public void inputTextForSearch() {
        elementFetch.getWebElement("ID", MainPageElements.searchBox).sendKeys("India");
    }

    public void clickOnSearchIcon() {
        elementFetch.getWebElement("XPATH", MainPageElements.searchIcon).click();
    }

    //Then verify products and click More Info on first product
    public void verifyProducts() throws InterruptedException {
        int productSize = elementFetch.getWebElements("XPATH", MainPageElements.products).size();
        WebElement q;
        for (int i = 0; i < productSize; i++) {
            q = elementFetch.getWebElements("XPATH", MainPageElements.products).get(0);
            System.out.println("information on products " + q.getText());
        }
    }

    public void moreInfoBtn() {
        int btns = elementFetch.getWebElements("XPATH", MainPageElements.moreInfoBtn).size();
        System.out.println("no of buttons " + btns);

//   //        ListIterator<WebElement> theListOfbtns = elementFetch.getWebElements("CLASS",MainPageElements.moreInfoBtn).listIterator();
//        int i = 1;
//        while(theListOfbtns.hasNext()) {
//            WebElement btnI = elementFetch.getWebElement("CLASS",MainPageElements.button);
//            btnI.click();
//        }
//        elementFetch.getWebElements("CSS",MainPageElements.button).get(3).click();
    }

    public void clickOnDayPrices() {
        elementFetch.getWebElement("XPATH", MainPageElements.daysPrices).getText();
        System.out.println("prices displayed");
    }

    public void clickOnBookOnline() {
        elementFetch.getWebElement("XPATH", MainPageElements.bookingLink).click();
        System.out.println("Booking done");
    }

    public void verifyOnSelect() {
        elementFetch.getWebElement("ID", MainPageElements.selectId).isDisplayed();
        elementFetch.getWebElement("XPATH", MainPageElements.displayDefaultAmt).getText();
        System.out.println("Selected date verified");
//        WebDriverWait myElement = new WebDriverWait(driver, 30);
//        elementFetch.getWebElement("XPATH", MainPageElements.continueBtn).get(1).click();
        int contCount = elementFetch.getWebElements("XPATH", MainPageElements.continueBtn).size();
        WebElement con;
        for (int i = 0; i < contCount; i++) {
            con = elementFetch.getWebElements("XPATH", MainPageElements.continueBtn).get(1);
            con.click();
            System.out.println("continue button " + con.getText());
        }
//       elementFetch.getWebElement("TAGNAME", MainPageElements.stdRoomSelection).click();
//        WebElement myDynamicElement =
//                (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(elementFetch.getWebElement("TAGNAME", MainPageElements.stdRoomSelection)));
//    d.isSelected();
//        try {
//            WebDriverWait myElement = new WebDriverWait(driver, 30);
//            myElement.until(ExpectedConditions.elementToBeSelected(d));
////            Select sel = new Select(d);
//            sel.selectByValue("1");

            System.out.println("clicked on link");

//        } catch (Exception e) {
//            JavascriptExecutor executor = (JavascriptExecutor) driver;
//            Actions act = new Actions(driver);
//            act.moveToElement(d);
//            d.isSelected();
//            System.out.println("SELECTED");
//        }

        }

    //Click on the first product of India
    public void clickOnLink() throws InterruptedException {
        int linkSize = elementFetch.getWebElements("XPATH", MainPageElements.link1).size();
        WebElement s = elementFetch.getWebElement("XPATH", MainPageElements.link1);
        WebElement x;
        WebDriverWait myElement = new WebDriverWait(driver, 30);
            myElement.until(ExpectedConditions.elementToBeSelected(s));
            Select sel = new Select(s);
        sel.selectByValue("1");
//        List<WebElement> list = sel.getOptions();
//        for(int i=0;i<list.size();i++){
//            list.get(1).click();
//                System.out.println("The index of the selected option is: "+i);
//                break;
//            }
//                for (int i = 0; i < linkSize; i++) {
//            try {
//                Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                        .ignoring(StaleElementReferenceException.class)
//                        .withMessage("not found");
//                WebElement element = fluentWait.until(webDriver -> s);
//                new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(s)).click();
//                System.out.println("clicked on link");
//
//            } catch (Exception e) {
//                JavascriptExecutor executor = (JavascriptExecutor) driver;
//                Actions act = new Actions(driver);
//                act.moveToElement(s);
//            }
////            if(linkSize>0){
//                executor.executeScript("arguments[0].click();", s);
//                Thread.sleep(2000);
//            } else {
//                System.out.println("nothing");
//            }

//            boolean staleElement = true;
//            while(staleElement){
//                try{
//                    Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                        .ignoring(StaleElementReferenceException.class)
//                .withMessage("not found");
//        WebElement element = fluentWait.until(webDriver -> s);
//                    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element)).click();
//                    staleElement = false;
//
//                } catch(StaleElementReferenceException e){
//                    staleElement = true;
//                }
//            }
//            int j=1;
//            while (true) {
//                WebElementdisplay=s;
//                System.out.println(WebElementdisplay);
////                if (WebElementdisplay.isDisplayed()==true)
//                {
//                    System.out.println("inside if statement"+j);
//                    executor.executeScript("arguments[0].click();", s);
//                    break;
//                }
//                else
//                {
//                    System.out.println("inside else statement"+ j);
//                    j=j+1;
//                }
//            }

//                .pollingEvery(Duration.of(500, MILLIS))
//                .withTimeout(Duration.of(10, SECONDS))
//                .withMessage("not found");
//        WebElement element = fluentWait.until(webDriver -> webDriver.findElement(By.xpath("...")));
//        element.sendKeys("some text");
//        Actions act =  new Actions(driver);
//        act.moveToElement(s.click());

    }
}