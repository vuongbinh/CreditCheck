package Modules;

import Pages.payment_CreditCard_Page;
import org.testng.annotations.Test;

public class payment_CreditCard extends BaseTest {
    @Test
    static void validateCreditCard(){
        payment_CreditCard_Page card_page = new payment_CreditCard_Page(driver);
        card_page.open();
        card_page.waitForElement(10);
        card_page.select();

    }
}
