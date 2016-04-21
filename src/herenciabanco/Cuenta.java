/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SM
 */
package herenciabanco;

public class Cuenta {
    protected int numeroCuenta;
    protected String nombreCliente;
    protected double saldo;
//CONSTRUCTOR

    public Cuenta() {
        this.numeroCuenta = 00000000000;
        this.nombreCliente = "XXXXXXXXXX";
        this.saldo = 0;
    }
    
    public Cuenta(int numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
//GETTERS AND SETTERS
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//METODOS  
    public void consultarDatos(){
        System.out.println("Nombre: "+ nombreCliente + " // Numero de cuenta:" + numeroCuenta +" //El saldo actual que posee es de: " + saldo);
    }    
    public double depositar(double deposito){
        saldo+=deposito;
        return saldo;
    }
    public double retirar(double retiro){
        saldo-=retiro;
        return saldo;
    }
    
}
