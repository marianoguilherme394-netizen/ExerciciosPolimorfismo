/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_Abstract;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    
    private String nome;
    private String especie;
    
    public Animal(String nome, String especie){
        setNome(nome);
        setEspecie(especie);
    }
    
    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void Info(){
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nome: " + getNome());
    }
    
}
