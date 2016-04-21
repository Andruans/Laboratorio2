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
public class Peperoni implements Pizza {
    String masa = "regular";
    String salsa = "tomate";
    String[] Ingredientes = {"rodajas de peperoni", "rodajas de cebolla", "queso parmesano rallado"};
    String tiempo="15:00";
    String tipoCorte = "Circular";
    
    @Override
    public void imprimirIngredientes(){
        int n = Ingredientes.length;
        for(int i=0;i<n-1;i=i+2){
            System.out.print(" "+Ingredientes[i]+" "+ Ingredientes[i+1]);
            System.out.println("");
        }
    }   
    
   public void preparacion(){
        System.out.println("La pizza peperoni posee una deliciosa masa " + masa + " que esta agregandose.....");
        System.out.println("Se le adiciono una espectacular salsa de "+ salsa + " que huele delicioso...");
        System.out.println("Le estamos agregando los ingredientes..");
        imprimirIngredientes();
        System.out.println("El timpo de preparacion fue ..." + tiempo+ " La pizza es" + tipoCorte);
    } 
}
