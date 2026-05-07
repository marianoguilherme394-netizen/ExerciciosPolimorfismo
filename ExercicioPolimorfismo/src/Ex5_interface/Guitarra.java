/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_interface;

/**
 *
 * @author maria
 */
public class Guitarra implements InstrumentoMusical{
    
    String instrumento;
    String modelo;
    
    public Guitarra(String instrumento, String modelo) {
        this.instrumento = instrumento;
        this.modelo = modelo;
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
