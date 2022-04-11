package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class Logout_Test extends Hooks {
    ThreadLocal<Login> cerrarsesion = ThreadLocal.withInitial(Login::new);
    @Test
    public void logoutsesion(){
        //cerrarsesion.get().initlogin();
        //cerrarsesion.get().logoutsession();
    }
}
