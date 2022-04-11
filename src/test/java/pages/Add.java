package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add extends Method {
@FindBy(xpath="//button[@onclick='addElement()']")
private WebElement addElement;
@FindBy(xpath="//button[@class='added-manually']")
    private WebElement deletedelement;

public Add elementadd(int opcion){
    for(int i = 0; i < opcion; i++)
    {
        UTILS_INTERFACE.clickElement(addElement);
    }
return this;}

public Add elementdeleted(int option){
    for ( int i = 0; i< option; i++){
        UTILS_INTERFACE.clickElement(deletedelement);
    }
    WAIT_INTERFACE.pause(4);
return this;}

}
