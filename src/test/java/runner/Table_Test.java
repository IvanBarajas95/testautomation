package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Table;

public class Table_Test extends Hooks {
    ThreadLocal<Table> tabla = ThreadLocal.withInitial(Table::new);
    @Test
    public void selectnumber(){
        tabla.get().listatabla();
    }
}
