/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_Abstract;

/**
 *
 * @author Admin
 */
public class Gato extends Animal{

    public Gato(String nome, String especie) {
        super(nome, especie);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("----- Som do Gato -----");
        System.out.println("Miau Miau");
    }
    
    @Override
    public void Info(){
        System.out.println("----- Info Gato -----");
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nome: " + getNome());
    }
    
}
