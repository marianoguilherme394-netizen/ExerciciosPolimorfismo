/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_abstract;

/**
 *
 * @author maria
 */
public class Piano extends InstrumentoMusical{
    
    public Piano(String instrumento, String modelo) {
        super(instrumento, modelo);
    }

    @Override
    public void tocar() {
        System.out.println("Um " + this.instrumento + " está tocando All of Me");
    }
    
    @Override
    public void Info(){
        System.out.println("----- Piano -----");
        System.out.println("Instrumento: " + this.instrumento);
        System.out.println("Modelo: " + this.modelo);
    }
}
