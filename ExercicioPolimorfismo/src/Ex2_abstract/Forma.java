/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_abstract;

/**
 *
 * @author maria
 */
public abstract class Forma {
    
    String forma;
    
    public Forma (String forma){
        this.forma = forma;
        
    }
    
    public abstract void calcularArea();
    
    public void infoForma(){
        System.out.println("Forma geometrica: " + this.forma);
    }
    
    
    
}
