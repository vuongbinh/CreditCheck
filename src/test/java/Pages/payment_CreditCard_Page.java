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
    By cardImg_XPATH = By.xpath("//*[@id='full-width-tabpanel-payment-method']/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/img");

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

    public void sentValue(String cardNumber, String cardExpiration, String cardSecurityCODE){
        driver.findElement(paymentCardNumber_XPATH).sendKeys(cardNumber);
        driver.findElement(paymentExpirationDate_XPATH).sendKeys(cardExpiration);
        driver.findElement(paymentCVV_XPATH).sendKeys(cardSecurityCODE);
    }

    public void btnClick(){
        if (!driver.findElements(checkboxSOW_XPATH).isEmpty()){
            driver.findElement(checkboxSOW_XPATH).click();
        } else if (!driver.findElements(checkboxSLASA_XPATH).isEmpty()){
            driver.findElement(checkboxSLASA_XPATH).click();
        }
    }

    public void submit(){
        driver.findElement(btnReviewYourOrder_XPATH).click();
    }

    public String getAttribute(){
        return driver.findElement(cardImg_XPATH).getAttribute("src");
    }

    @Override
    public void open() {
        driver.get("http://ec2-3-209-7-183.compute-1.amazonaws.com/checkout/gik_qAWqEGKyj5P_Vsh8NO_yd2XOKcpLMXepGsx0FT4=?currency=USD&tab=payment-method");
    }


}
