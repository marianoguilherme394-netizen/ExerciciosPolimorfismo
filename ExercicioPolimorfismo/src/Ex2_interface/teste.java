/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_interface;

/**
 *
 * @author maria
 */
public class teste {
    public static void main (String [] args){
        
        Forma c1 = new Circulo("Circulo", 3.14, 5);
        c1.infoForma();
        c1.calcularArea();
        
        Forma r1 = new Retangulo("Retangulo", 10, 5);
        r1.infoForma();
        r1.calcularArea();
    }
    
}
