package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Add;



public class Add_Test extends Hooks {
    ThreadLocal <Add> elegiropcion;
    @Test
    public void anadir() {
        int opcion = 10;
        int option = 4;
        elegiropcion = ThreadLocal.withInitial(Add::new);
        elegiropcion.get().elementadd(opcion).elementdeleted(option);
        }

    }
