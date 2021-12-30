package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class payment_CreditCard_Page extends BasePage{

    By paymentMethod_ID = By.id("mui-component-select-payment_method");
    By paymentCardNumber_XPATH = By.xpath("//*[@name='credit_card.card_number']");
    By paymentExpirationDate_XPATH = By.xpath("//*[@name='credit_card.expiration_date']");
    By paymentCVV_XPATH = By.xpath("//*[@name='credit_card.security_code']");
    By checkboxSOW_XPATH = By.xpath("//*[@name='sow_acknowledgement']");
    By checkboxSLASA_XPATH = By.xpath("//*[@name='slasa_acknowledgement']");
    By btnReviewYourOrder_XPATH = By.xpath("//button[.='Review Your Order']");
    By paymentMethodCreditCard_XPATH = By.xpath("//li[.='Credit Card']");
    By titleCreditCard_XPATH = By.xpath("//h4[.='Credit Card']");

    public payment_CreditCard_Page(WebDriver webDriver){super(webDriver);}

    public void waitForElement(int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (paymentMethod_ID));
    }

    public void select(){
        WebElement element = driver.findElement(paymentMethod_ID);
        element.click();
        element.findElement(paymentMethodCreditCard_XPATH).click();
    }

    public void sentValue(int cardNumber, int cardExpiration, int cardSecurityCODE){
        WebElement element = driver.findElement(paymentCardNumber_XPATH)
    }

    public String getValue(String idx){
        return "s";
    }

    @Override
    public void open() {
        driver.get("http://ec2-3-209-7-183.compute-1.amazonaws.com/checkout/gik_qAWqEGKyj5P_Vsh8NO_yd2XOKcpLMXepGsx0FT4=?currency=USD&tab=payment-method");
    }


}
