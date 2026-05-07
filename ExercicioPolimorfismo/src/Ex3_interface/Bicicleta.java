/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_interface;

/**
 *
 * @author maria
 */
public class Bicicleta implements Veiculo{
    
    String tipoVeiculo;
    String modelo;
    
    public Bicicleta(String tipoVeiculo, String modelo) {
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
    }

    @Override
    public void Info(){
        System.out.println("----- Bicicleta -----");
        System.out.println("Veiculo: " + this.tipoVeiculo);
        System.out.println("Modelo do Veiculo: " + this.modelo);
    }
    
    @Override
    public void mover(){
        System.out.println("Uma " + this.tipoVeiculo + " está andando pelo parque ceret");
    }
    
}
