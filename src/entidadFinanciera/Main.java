package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel Jurado Arroyo
 */

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
            probarRetirar(objetoCuenta, null);
            probarIngresar(objetoCuenta, null);
    }

    private static void probarRetirar(CCuenta objetoCuenta, Object cantidadEsperada) {
        try {
            objetoCuenta.retirar(300);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Retiro realizado.");
    }

    private static void probarIngresar(CCuenta objetoCuenta, Object cantidadEsperada) {
        try {
            objetoCuenta.ingresar(500);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ingreso realizado.");
    }
    
       
}
