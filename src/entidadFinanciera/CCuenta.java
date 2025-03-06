package entidadFinanciera;

/**
 * Clase que representa una cuenta bancaria con funcionalidades básicas 
 * como consultar el saldo, ingresar y retirar dinero.
 * 
 * @author Manuel Jurado Arroyo
 */

public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    
     /**
     * Número de cuenta bancaria.
     */
    private String cuenta;
    
    /**
     * Saldo disponible en la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor que inicializa una cuenta con los valores especificados.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible en la cuenta.
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA );
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Mensaje de error cuando se intenta ingresar una cantidad negativa.
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Método para retirar una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

 /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     * 
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo disponible en la cuenta.
     * 
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés asociado a la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}


    
   