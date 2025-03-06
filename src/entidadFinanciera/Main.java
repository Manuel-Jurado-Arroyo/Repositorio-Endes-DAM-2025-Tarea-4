package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que contiene el m�todo main para ejecutar la aplicaci�n. Se
 * encarga de crear un objeto de la clase CCuenta y mostrar su saldo inicial.
 *
 * @author Manuel Jurado Arroyo
 */
public class Main {

    /**
     * M�todo principal que ejecuta la aplicaci�n. Crea un objeto de CCuenta,
     * muestra el saldo inicial y realiza pruebas de ingreso y retiro.
     *
     * @param args Argumentos de l�nea de comandos (no utilizados en este
     * programa).
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        //Creaci�n de una cuenta con valores iniciales.         
        objetoCuenta = new CCuenta("Antonio L�pez", "1000-2365-85-1230456789", 2500, 0);

        //Obtener el saldo actual de la cuenta.
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);

        /**
         * Probar las operaciones de retirar e ingresar dinero.
         */
        probarRetirar(objetoCuenta, null);
        probarIngresar(objetoCuenta, null);
    }

    /**
     * M�todo para probar la operaci�n de retiro en la cuenta.
     *
     * @param objetoCuenta Objeto de la clase CCuenta sobre el cual se realiza
     * la operaci�n.
     * @param cantidadEsperada A�adida porque era solicitada en la tarea. No se
     * usa en este caso, pero podr�a representar un valor esperado.
     */
    private static void probarRetirar(CCuenta objetoCuenta, Object cantidadEsperada) {
        try {
            objetoCuenta.retirar(300);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Retiro realizado.");
    }

    /**
     * M�todo para probar la operaci�n de ingreso en la cuenta.
     *
     * @param objetoCuenta Objeto de la clase CCuenta sobre el cual se realiza
     * la operaci�n.
     * @param cantidadEsperada No se usa en este caso, pero podr�a representar
     * un valor esperado.
     */
    private static void probarIngresar(CCuenta objetoCuenta, Object cantidadEsperada) {
        try {
            objetoCuenta.ingresar(500);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ingreso realizado.");
    }

}
