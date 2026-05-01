/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Carro{
    
    private double CargaBateria;
    
    public CarroEletrico(String Modelo, String placa, String marca, double CargaBateria) {
        super(Modelo, placa, marca);
        setCargaBateria(CargaBateria);
    }

    public double getCargaBateria() {
        return CargaBateria;
    }

    public void setCargaBateria(double CargaBateria) {
        this.CargaBateria = CargaBateria;
    }
    
    @Override
    public void Info(){
        System.out.println("------ Informações do Carro ------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Carga da bateria: " + getCargaBateria());
    }
    
}
