package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class Login_Test extends Hooks {
    ThreadLocal<Login> iniciarsesion;
    @Test
    public void logininit(){
        String tomsmith ="tomsmith";
        iniciarsesion = ThreadLocal.withInitial(Login::new);
        iniciarsesion.get().initlogin(tomsmith);
    }
    @Test
    public void logout(){
        iniciarsesion = ThreadLocal.withInitial(Login::new);
        //iniciarsesion.get().initlogin().logoutsession();
    }
}
