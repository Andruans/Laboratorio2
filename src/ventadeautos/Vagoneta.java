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
public class Vagoneta extends Auto{

    public Vagoneta(int numPasajeros, int numSerieMotor, String marca, int año, double precio) {
        super(numPasajeros, numSerieMotor, marca, año, precio);
    }
    
    @Override
    public String toString() {
        return  super.toString() + " y es una vagoneta";
    }
    
}
