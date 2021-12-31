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
        card_page.sentValue("22222222222","2222","223");
        //card_page.btnClick();
        System.out.print(card_page.getAttribute());
        //card_page.submit();


    }
}
