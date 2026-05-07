/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_abstract;

/**
 *
 * @author maria
 */
public class Retangulo extends Forma{
    
    double base;
    double altura;

    public Retangulo(String forma, double base, double altura) {
        super(forma);
        
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        double area = this.base * this.altura;
        
        System.out.println("A area do Retangulo é " + area);
    }
    
    @Override
    public void infoForma(){
        System.out.println("----- Area das formas geometricas -----");
        System.out.println("Forma Geometrica: " + this.forma);
        System.out.println("Valor da base: " + this.base);
        System.out.println("Valor da altura: " + this.altura);
    }
    
    
    
}
