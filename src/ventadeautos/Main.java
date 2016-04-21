/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadeautos;

/**
 *
 * @author Andruans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo(0000, "Generico", 0000, 0000);
        Auto a = new Auto(0000, 0000, "Generico", 0000, 0000);
        Compacto c = new Compacto (5, 123, "Renault", 1993, 12000000);
        Lujo l = new Lujo (2, 456, "Lamborghini", 2012, 150000000);
        Vagoneta va = new Vagoneta(10, 789, "Volkswagen", 1970, 10000000);
        Camioneta ca = new Camioneta(3500, 4, 2, 3, 321, "Toyota", 2005, 50000000);
         
        System.out.println(c.toString());
        System.out.println(l.toString());
        System.out.println(va.toString());
        System.out.println(ca.toString());
        
    }
    
}
