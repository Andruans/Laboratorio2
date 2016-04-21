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
public class Auto extends Vehiculo {
    private int numPasajeros;

    public Auto(int numPasajeros, int numSerieMotor, String marca, int año, double precio) {
        super(numSerieMotor, marca, año, precio);
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + " posee " + numPasajeros + " asientos" ;
    }
    
}
