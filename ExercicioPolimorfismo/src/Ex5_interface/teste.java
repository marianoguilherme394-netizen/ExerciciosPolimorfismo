/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_interface;

/**
 *
 * @author maria
 */
public class teste {
    public static void main (String [] args){
        InstrumentoMusical guitarra = new Guitarra("Guitarra", "Stratocaster");
        guitarra.Info();
        guitarra.tocar();
        
        InstrumentoMusical piano = new Piano("Piano", "Acústico");
        piano.Info();
        piano.tocar();
    }
    
}
