package Utils;

import PageEvents.MainPageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
    @Test
    public void sampleMethodForSearchBoxEntering() throws InterruptedException {
        MainPageEvents mainPageEvents=new MainPageEvents();
        mainPageEvents.clickOnSearchBox();
        mainPageEvents.inputTextForSearch();
        mainPageEvents.clickOnSearchIcon();
        mainPageEvents.verifyProducts();
        mainPageEvents.moreInfoBtn();
        mainPageEvents.clickOnLink();
        mainPageEvents.clickOnDayPrices();
        mainPageEvents.clickOnBookOnline();
        mainPageEvents.verifyOnSelect();
    }
}
