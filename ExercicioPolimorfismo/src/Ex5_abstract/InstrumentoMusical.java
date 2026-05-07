/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_abstract;

/**
 *
 * @author maria
 */
public abstract class InstrumentoMusical {
    String instrumento;
    String modelo;

    public InstrumentoMusical(String instrumento, String modelo) {
        this.instrumento = instrumento;
        this.modelo = modelo;
    }
    
    public abstract void tocar();
    
    public void Info(){
        
    }
    
}
