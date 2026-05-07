/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_abstract;

/**
 *
 * @author maria
 */
public class teste {
    public static void main (String [] args){
        Veiculo carro = new Carro("Carro", "Kicks");
        carro.Info();
        carro.mover();
        
        Veiculo bicicleta = new Bicicleta("Bicicleta", "Mountain Bike");
        bicicleta.Info();
        bicicleta.mover();
    }
    
}
