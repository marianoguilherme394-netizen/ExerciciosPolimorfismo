/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_abstract;

/**
 *
 * @author maria
 */
public class Carro extends Veiculo{

    public Carro(String tipoVeiculo, String modelo) {
        super(tipoVeiculo, modelo);
    }

    @Override
    public void Info(){
        System.out.println("----- Carro -----");
        System.out.println("Veiculo: " + this.tipoVeiculo);
        System.out.println("Modelo do Veiculo: " + this.modelo);
    }
    
    @Override
    public void mover(){
        System.out.println("o " + this.tipoVeiculo + " está andando pela Celso Garcia");
    }
    
}
