/**
 * Clase CCuenta que simula una cuenta bancaria sencilla.
 * Permite realizar ingresos y retiradas de dinero.
 *
 * @author Rafael
 * @version 1.0
 */
public class CCuenta {

    public double dSaldo = 0;

    /**
     * Método principal de ejecución
     */
    public static void main(String[] args) {

        // Depuración. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros"); //ss

        // Depuración. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        // Depuración. Provoca parada con condición de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    }

    /**
     * Permite ingresar dinero en la cuenta
     * @param cantidad cantidad a ingresar
     * @return código de error
     */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuración. Punto de parada. Solo en el 3 ingreso
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        // Depuración. Punto de parada cuando la cantidad es menor de 0
        return iCodErr;
    }

    /**
     * Permite retirar dinero de la cuenta
     * @param cantidad cantidad a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
        }
    }
}

