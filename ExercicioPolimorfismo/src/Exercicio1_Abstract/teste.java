/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_Abstract;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main(String [] args){
        Animal cachorro = new Cachorro("Zoe", "Pug");
        Animal gato = new Gato("Garfield", "Persa");
        
        cachorro.Info();
        cachorro.fazerSom();
        
        gato.Info();
        gato.fazerSom();
        
    }
    
}
