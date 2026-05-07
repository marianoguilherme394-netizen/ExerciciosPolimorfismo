/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_abstract;

/**
 *
 * @author maria
 */
public class teste {
    public static void main (String [] args){
        Funcionario gerente = new Gerente("Isabella Almeida", "Gerente", "45687709842", 1800.00);
        gerente.Info();
        gerente.calcularSalario();
        
        Funcionario vendedor = new Vendedor("Guilherme Ferreira", "Vendedor", "77654489076", 1800.00, 200.00);
        vendedor.Info();
        vendedor.calcularSalario();
    }
    
}
