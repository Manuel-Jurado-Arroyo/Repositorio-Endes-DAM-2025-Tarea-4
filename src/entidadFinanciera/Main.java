package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación. Se
 * encarga de crear un objeto de la clase CCuenta y mostrar su saldo inicial.
 *
 * @author Manuel Jurado Arroyo
 */
public class Main {

    /**
     * Método principal que ejecuta la aplicación. Crea un objeto de CCuenta,
     * muestra el saldo inicial y realiza pruebas de ingreso y retiro.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este
     * programa).
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        //Creación de una cuenta con valores iniciales.         
        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

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
     * Método para probar la operación de retiro en la cuenta.
     *
     * @param objetoCuenta Objeto de la clase CCuenta sobre el cual se realiza
     * la operación.
     * @param cantidadEsperada Añadida porque era solicitada en la tarea. No se
     * usa en este caso, pero podría representar un valor esperado.
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
     * Método para probar la operación de ingreso en la cuenta.
     *
     * @param objetoCuenta Objeto de la clase CCuenta sobre el cual se realiza
     * la operación.
     * @param cantidadEsperada No se usa en este caso, pero podría representar
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
