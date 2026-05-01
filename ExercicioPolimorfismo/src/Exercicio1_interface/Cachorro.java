/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_interface;

/**
 *
 * @author Admin
 */
public class Cachorro implements Animal{
    
    @Override
    public void fazerSom(){
        System.out.println("----- Som do Cachorro -----");
        System.out.println("Au Au");
    }
    
}
