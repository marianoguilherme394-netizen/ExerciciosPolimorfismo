/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_abstract;

/**
 *
 * @author maria
 */
public class Vendedor extends Funcionario{
    
    double comissão;
    
    public Vendedor(String nome, String cargo, String cpf, double salarioBase, double comissão) {
        super(nome, cargo, cpf, salarioBase);
        
        this.comissão = comissão;
    }

    @Override
    public void calcularSalario() {
        double salarioVendedor = this.salarioBase + this.comissão;
        
        System.out.println("Salario do Vendedor: " + salarioVendedor);
    }
    
    @Override
    public void Info(){
        System.out.println("----- info gerente -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Cpf: " + this.cpf);
    }
    
}
