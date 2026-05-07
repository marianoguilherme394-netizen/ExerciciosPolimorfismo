/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_abstract;

/**
 *
 * @author maria
 */
public class Guitarra extends InstrumentoMusical{

    public Guitarra(String instrumento, String modelo) {
        super(instrumento, modelo);
    }

    @Override
    public void tocar() {
        System.out.println("Uma " + this.instrumento + " está tocando Back in Black");
    }
    
    @Override
    public void Info(){
        System.out.println("----- Guitarra -----");
        System.out.println("Instrumento: " + this.instrumento);
        System.out.println("Modelo: " + this.modelo);
    }
    
}
