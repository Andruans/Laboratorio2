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
public class Vehiculo {
    private int numSerieMotor;
    private String marca;
    private int año;
    private double precio;

    public Vehiculo(int numSerieMotor, String marca, int año, double precio) {
        this.numSerieMotor = numSerieMotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El Vehiculo tiene un " + "numero de serie de motor = " + numSerieMotor 
                + ", la marca es = " + marca + ", del año = " + año + ", cuesta = " + precio;
    }
    
    
    
}
