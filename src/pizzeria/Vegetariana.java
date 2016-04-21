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
public class Vegetariana  implements Pizza { //extends Pizza {//
    String masa = "regular";
    String salsa = "tomate";
    String[] Ingredientes = {"mozarrella","parmesano rallado","cebolla picada", "hongos en rebanadas", "piminienta roja en rodajas", "aceitunas negras rebanadas"};
    String tiempo="12:20";
    String tipoCorte = "Cuadrada";
    @Override
    public void imprimirIngredientes(){
        int n = Ingredientes.length;
        for(int i=0;i<n-1;i=i+2){
            System.out.print(" "+Ingredientes[i]+" "+ Ingredientes[i+1]);
            System.out.println("");
        }
    }
    
   public void preparacion(){
        System.out.println("La pizza posee una deliciosa masa " + masa + " que esta agregandose.....");
        System.out.println("Se le adiciono una espectacular salsa de "+ salsa + " que huele delicioso...");
        System.out.println("Le estamos agregando los ingredientes..");
        imprimirIngredientes();
        System.out.println("El timpo de preparacion fue ..." + tiempo + " La pizza es " + tipoCorte);
    } 
    
   
    
    
    
}
