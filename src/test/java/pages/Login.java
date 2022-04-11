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
    @FindBy(xpath="//a[@class='button secondary radius']")
    private WebElement buttonlogout;

    public Login initlogin(String user){
        SEN_KEYS_INTERFACE.sendKeys(username,user);
        SEN_KEYS_INTERFACE.sendKeys(password,"SuperSecretPassword!");
        UTILS_INTERFACE.clickElement(buttonlogin);
    return this;}

    public Login logoutsession(){
        WAIT_INTERFACE.waitForElementToClickeable(10,5,buttonlogout);
        UTILS_INTERFACE.clickElement(buttonlogout);
    return this;}
}
