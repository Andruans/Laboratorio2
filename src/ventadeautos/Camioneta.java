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
public class Camioneta extends Auto{
    private int carga;
    private int ejes;
    private int rodadas;

    public Camioneta(int carga, int ejes, int rodadas, int numPasajeros, 
            int numSerieMotor, String marca, int año, double precio) {
        super(numPasajeros, numSerieMotor, marca, año, precio);
        this.carga = carga;
        this.ejes = ejes;
        this.rodadas = rodadas;
    }  

    @Override
    public String toString() {
        return super.toString() + ", soporta una carga de" + carga 
                + " kg, tiene " + ejes + " ejes, tiene " + rodadas + " rodadas y es una camioneta";
    }
    
    
}
