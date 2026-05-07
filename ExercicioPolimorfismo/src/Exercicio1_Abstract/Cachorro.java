/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_Abstract;

/**
 *
 * @author Admin
 */
public class Cachorro extends Animal{

    public Cachorro(String nome, String especie) {
        super(nome, especie);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("----- Som do Cachorro -----");
        System.out.println("Au Au");
    }
    
    @Override
    public void Info(){
        System.out.println("----- Info Cachorro -----");
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nome: " + getNome());
    }
    
}
