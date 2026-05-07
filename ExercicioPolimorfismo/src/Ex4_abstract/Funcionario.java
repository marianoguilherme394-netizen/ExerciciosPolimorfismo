/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_abstract;

/**
 *
 * @author maria
 */
public abstract class Funcionario {
    String nome;
    String cargo;
    String cpf;
    double salarioBase;
    
    public Funcionario(String nome, String cargo, String cpf, double salarioBase){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.cpf = cpf;
    }

    public abstract void calcularSalario();
    
    public void Info(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Cpf: " + this.cpf);
    }
    
}
