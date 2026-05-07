/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_interface;

/**
 *
 * @author maria
 */
public class Circulo implements Forma{
    String forma;
    double pi;
    double raio;
    
    public Circulo (String forma, double pi, double raio){
        this.forma = forma;
        this.pi = pi;
        this.raio = raio;
    }
    
    @Override
    public void calcularArea(){
        double area = this.pi * (this.raio*this.raio);
        
        System.out.println("A area do Circulo é " + area);
    }
    
    @Override
    public void infoForma(){
        System.out.println("----- Area das formas geometricas -----");
        System.out.println("Forma Geometrica: " + this.forma);
        System.out.println("Valor de pi: " + this.pi);
        System.out.println("Valor do raio: " + this.raio);
    }
    
}
