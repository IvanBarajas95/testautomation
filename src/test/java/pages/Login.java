package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Method {
    @FindBy(xpath="//input[@id='username']")
    private WebElement username;
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
    @FindBy(xpath="//i[@class='fa fa-2x fa-sign-in']")
    private WebElement buttonlogin;

    public Login initlogin(){
        SEN_KEYS_INTERFACE.sendKeys(username,"tomsmith");
        SEN_KEYS_INTERFACE.sendKeys(password,"SuperSecretPassword!");
        UTILS_INTERFACE.clickElement(buttonlogin);
        WAIT_INTERFACE.pause(5);
    return this;}
}
