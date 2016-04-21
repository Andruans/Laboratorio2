/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciabanco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author SM
 */
public class HerenciaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        //Banco bancolombia = new Banco;
        //Se define un cliente
        System.out.println("||--------------BIENVENIDO A MENU DEL BANCO -----------------------||");
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||--- Desea crear una cuenta de que tipo:--------------------------||");
        System.out.println("||--- 1) Cuenta de cheques-----------------------------------------||");
        System.out.println("||--- 2) Cuenta de ahorros-----------------------------------||");
        System.out.println("||-----------------------------------------------------------------||");
        int menu = lectura.nextInt();
        String nombreCliente;
        int numeroCuenta;
        double saldo;
        Cuenta a1 = new Cuenta();
        switch (menu){
                case 1:
                    System.out.println("Ingrese nombre del usuario:");nombreCliente=lectura.next();
                    System.out.println("Ingrese numero de cuenta  :");numeroCuenta=lectura.nextInt();
                    System.out.println("Ingrese saldo de cuenta   :");saldo=lectura.nextDouble();
                    System.out.println("Ingrese comision por uso de chequera:");double comision=lectura.nextDouble();
                    System.out.println("Ingrese comision por usar cheques sin fondos:");double comisionCheques=lectura.nextDouble();
                    //Cheques c1 = new Cheques(comision, comisionCheques, numeroCuenta, nombreCliente, saldo);
                    a1 = new Cheques(comision, comisionCheques, numeroCuenta, nombreCliente, saldo);
                    break ;
                case 2:
                    //System.out.println("Ingrese nombre del usuario:");nombreCliente=lectura.nextLine();
                    System.out.println("Ingrese nombre del usuario:");nombreCliente=lectura.next();
                    System.out.println("Ingrese numero de cuenta  :");numeroCuenta=lectura.nextInt();
                    System.out.println("Ingrese saldo de cuenta   :");saldo=lectura.nextDouble();
                    //System.out.println("Ingrese dia fecha de corte:");Date fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy").parse(lectura.nextLine());
                    Date fechaVencimiento = new Date(2015,8,4);
                    System.out.println("Ingrese interes mensual:");double interes = lectura.nextDouble();
                    //Ahorros a1 = new Ahorros(fechaVencimiento, interes, numeroCuenta, nombreCliente, saldo);
                    a1 = new Ahorros(fechaVencimiento, interes, numeroCuenta, nombreCliente, saldo);
                    break;//continue;//imprimir;
                default:
                    break;
                            
        }
        int menu1 = 0;
        imprimir: while(menu1 != 4){
            System.out.println("||-----------------------------------------------------------------||");
            System.out.println("||--- Que desea hacer:                   --------------------------||");
            System.out.println("||--- 1) mostrar datos-----------------------------------------||");
            System.out.println("||--- 2) retirar ----------------------------------------------||");
            System.out.println("||--- 3) consignar----------------------------------------------||");
            System.out.println("||--- 4) salir----------------------------------------------||");
            System.out.println("||-----------------------------------------------------------------||");
            menu1 = lectura.nextInt();
            switch (menu1){
                    case 1:
                        a1.consultarDatos();
                        continue imprimir;
                    case 2:
                        System.out.println("Ingrese valor que desea retirae de la cuenta   :");double retiro=lectura.nextDouble();
                        double r = a1.retirar(retiro);
                        System.out.println("el nuevo saldo es " + r);
                        break;//continue;//imprimir;
                    case 3:
                        System.out.println("Ingrese valor que desea depositar en la cuenta   :");double deposito=lectura.nextDouble();
                        double d = a1.depositar(deposito);
                        System.out.println("el nuevo saldo es " + d);
                        break;
                    default:
                        break;

            }
       
        }        
        //interfaz
        //char salir = 'n' ;
        
        /*menu: while(salir == 'n'){
        
        }*/
        
    }
    
}
