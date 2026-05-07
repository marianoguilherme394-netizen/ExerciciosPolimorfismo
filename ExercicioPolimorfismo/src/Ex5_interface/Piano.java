/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_interface;

/**
 *
 * @author maria
 */
public class Piano implements InstrumentoMusical{
    
    String instrumento;
    String modelo;
    
    public Piano(String instrumento, String modelo) {
        this.instrumento = instrumento;
        this.modelo = modelo;
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
