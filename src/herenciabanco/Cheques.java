/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciabanco;

/**
 *
 * @author SM
 */
public class Cheques extends Cuenta{
    private double comision;
    private double comisionCheques;
//    
    public Cheques(int numeroCuenta, String nombreCliente, double saldo) {
        super(numeroCuenta, nombreCliente, saldo);
    }
    public Cheques(double comision, double comisionCheques, int numeroCuenta, String nombreCliente, double saldo) {
        super(numeroCuenta, nombreCliente, saldo);
        this.comision = comision;
        this.comisionCheques = comisionCheques;
    }
    @Override
   public void consultarDatos(){
        //System.out.println("Nombre: "+ super.nombreCliente + " // Numero de cuenta:" + super.numeroCuenta +" //El saldo actual que posee es de: $" + super.saldo + "Fecha de vencimiento: " + fechaVencimiento + " y la tasa de interes es de $" + interes);
        System.out.println("Nombre: "+ super.nombreCliente + " // Numero de cuenta:" + super.numeroCuenta );
        System.out.println("El saldo actual que posee es de: $" + super.saldo);
        System.out.println("Comision: " + comision + " y la comision por usar cheques sin fondos es: $" + comisionCheques);
    } 
}
