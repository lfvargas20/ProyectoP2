/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model.items;


import ec.edu.espol.model.items.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author T_User
 */
public class Camioneta extends Vehiculo{
    private String marca;
    private String modelo;
    private String motor;
    private String vidrio;
    private String combustible;
    private String transmision;
    private String traccion;
    
    public Camioneta(String placa,int año,double recorrido,String color, String transmision,double precio,
            String marca, String modelo,String motor, String vidrio, String combustible,String traccion){
        super(placa,año,recorrido,color,precio);
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.vidrio = vidrio;
        this.combustible = combustible;
        this.transmision= transmision;
        this.traccion = traccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVidrio() {
        return vidrio;
    }

    public void setVidrio(String vidrio) {
        this.vidrio = vidrio;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    public static ArrayList<String> atributos(){
        ArrayList<String> lista = new ArrayList(Arrays.asList("Placa","Año","Recorrido",
                "Color","Transmisión","Precio","Marca","Modelo","Motor","Vidrio","Combustible","Traccion"));
        return lista;
    }
    
    
    
    @Override
    public String toString(){
        String cad = "Camioneta\nMatrícula del vehículo: " + this.placa + "\nMarca: " + this.marca +
                "\nModelo del vehículo: "+this.modelo+"\nTipo de motor: " + this.motor + "\nAño del vehículo: " + this.año +
                "\nRecorrido en km: " + this.recorrido + "\nTipo de combustible: " + this.combustible +
                "\nTipo de vidrios: "+this.vidrio+"\nTransmisión del vehículo: " + this.transmision + "\nPrecio: " + "$"+this.precio +"\n"+this.link;
        return cad;
    }

    @Override
    public String getTipo() {
        return "Camioneta";
    }
}
