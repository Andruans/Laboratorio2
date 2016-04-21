/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciabanco;
import java.util.*;
/**
 *
 * @author SM
 */
public class Ahorros extends Cuenta {
    private Date fechaVencimiento;
    private double interes;

    public Ahorros(Date fechaVencimiento, double interes, int numeroCuenta, String nombreCliente, double saldo) {
        super(numeroCuenta, nombreCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.interes = interes;
    }
    @Override
   public void consultarDatos(){
        //System.out.println("Nombre: "+ super.nombreCliente + " // Numero de cuenta:" + super.numeroCuenta +" //El saldo actual que posee es de: $" + super.saldo + "Fecha de vencimiento: " + fechaVencimiento + " y la tasa de interes es de $" + interes);
        System.out.println("Nombre: "+ super.nombreCliente + " // Numero de cuenta:" + super.numeroCuenta );
        System.out.println("El saldo actual que posee es de: $" + super.saldo);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento + " y la tasa de interes es de $" + interes);
    } 
}
