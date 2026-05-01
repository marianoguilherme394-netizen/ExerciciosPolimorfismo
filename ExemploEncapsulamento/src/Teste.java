/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String [] args){
        
        Carro c1 = new Carro("Chevrolet", "BRA2E19", "Onix");
        
        c1.Info();
        
        CarroEletrico ce1 = new CarroEletrico("Chevrolet", "BRA2E19", "Onix", 20.00);
        
        ce1.Info();
    }
}
