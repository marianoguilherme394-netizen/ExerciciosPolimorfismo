/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_abstract;

/**
 *
 * @author maria
 */
public abstract class Veiculo {
    String tipoVeiculo;
    String modelo;
    
    public Veiculo(String tipoVeiculo, String modelo){
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
    }
    
    public abstract void mover();
    
    public void Info(){
        
    }
    
}
