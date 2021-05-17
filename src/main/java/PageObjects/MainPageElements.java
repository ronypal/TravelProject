package PageObjects;

public interface MainPageElements {
    String searchBox= "searchtext_freetext_search_form";
//    String searchIcon="//div[@class='nbf_button']";
String searchIcon="//div[@class='nbf_button' and contains(text(), 'Search for your dream holiday or enter a holiday code')]";
String products="//div[@class='nbf_tpl_custom  productlist_grid' ]";
//    String producCount=  "//span[contains(@class, 'nbf_tpl_productsearchcount_cnt')]";
String moreInfoBtn="//button[@class='nbf_tpl_text more-info-button button-main  button-text']";
//String moreInfoBtn="//button[contains(text(),'More info')]";
String link1="//a[@class='product_preview_hero_link flex shadow-03 flex-column flex-nowrap']//img";
    String links="//*[@class='nbf_tpl_text product-text medium']";
    String daysPrices="//*[@id='price-pin_pin-container']";
    String bookingLink="//*[contains(text(),'Book Online')]";
    String selectId="calbox-2276432a15eaf65ebfc0ffb211e6bf09-1";
    String displayDefaultAmt="//*[contains(text(),'GBP')]";
    String stdRoomSelection="//select[@name='room-0-numselect']";
    String continueBtn="//*[contains(text(),'Continue')]";
    //a[@href ='https://www.mailtravel.co.uk/holiday/incredible-india-2276432a15eaf65ebfc0ffb211e6bf09']
//a[@title ='Tour - Incredible India']
}
