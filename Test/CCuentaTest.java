import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CCuentaTest {

    @Test
    public void testIngresarCantidadNegativa() {
        CCuenta cuenta = new CCuenta();
        assertEquals(1, cuenta.ingresar(-50));
    }

    @Test
    public void testIngresarCantidadCorrecta() {
        CCuenta cuenta = new CCuenta();
        assertEquals(0, cuenta.ingresar(100));
        assertEquals(100, cuenta.dSaldo);
    }

    @Test
    public void testRetirarCantidadCorrecta() {
        CCuenta cuenta = new CCuenta();
        cuenta.ingresar(200);
        cuenta.retirar(50);
        assertEquals(150, cuenta.dSaldo);
    }

    @Test
    public void testRetirarSinSaldo() {
        CCuenta cuenta = new CCuenta();
        cuenta.retirar(100);
        assertEquals(0, cuenta.dSaldo);
    }
}

