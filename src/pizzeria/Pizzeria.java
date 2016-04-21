/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author SM
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza1;
        //pizza2.preparacion();   

        java.util.Scanner lectura = new java.util.Scanner(System.in);
        //Banco bancolombia = new Banco;
        //Se define un cliente
        System.out.println("||--------------BIENVENIDO A LA PIZZERIA 2016-----------------------||");
        System.out.println("||------------------------------------------ -----------------------||");
        System.out.println("||--- Que tipo de pizza desea el dia de hoy ------------------------||");
        System.out.println("||--- 1) Vegetariana-----------------------------------------||");
        System.out.println("||--- 2) Peperoni-----------------------------------||");
        System.out.println("||--- 3) Queso-----------------------------------||");
        System.out.println("||-----------------------------------------------------------------||");
        int menu = lectura.nextInt();
        switch (menu) {
            case 1:
                pizza1 = new Vegetariana();
                pizza1.preparacion();
                break;
            case 2:
                pizza1 = new Peperoni();
                pizza1.preparacion();
                break;//continue;//imprimir;
            case 3:
                pizza1 = new Queso();
                pizza1.preparacion();
                break;
            default:
                break;
        }
        
    }

}
