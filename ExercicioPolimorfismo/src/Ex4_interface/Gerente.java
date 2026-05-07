/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_interface;

/**
 *
 * @author maria
 */
public class Gerente implements Funcionario{
    
    String nome;
    String cargo;
    String cpf;
    double salarioBase;
    
    public Gerente(String nome, String cargo, String cpf, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularSalario() {
        double salarioGerente = this.salarioBase+3000;
        
        System.out.println("Salario do gerente: " + salarioGerente);
    }
    
    @Override
    public void Info(){
        System.out.println("----- info gerente -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Cpf: " + this.cpf);
    }
}
