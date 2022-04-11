package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class Login_Test extends Hooks {
    ThreadLocal<Login> iniciarsesion = ThreadLocal.withInitial(Login::new);
    @Test
    public void logininit(){
        iniciarsesion.get().initlogin();
    }
}
