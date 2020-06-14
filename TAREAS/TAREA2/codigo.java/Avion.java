/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author USUARIO
 */
public class Avion extends Transporte {
    private int pasajeros;
    private String marca;
    private String modelo;
    /**
     * @return the pasajeros
     */
    public int getpasajeros() {
        return pasajeros;
    }

    /**
     * @param cantidadPasajeros the pasajeros to set
     */
    public void setpasajeros(int cantidadPasajeros) {
        this.pasajeros = cantidadPasajeros;
    }

    /**
     * @return the marca
     */
    public String getmarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setmarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getmodelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }


    public Avion(int pasajeros, String marca, String modelo) {
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
     @Override
    public void avanzar() {
         System.out.println("AVANCE-AVION-"+this.getpasajeros()+"-"
                 +this.getmarca()+"-"+this.getmodelo());
   }

    @Override
    public void frenar() {
         System.out.println("FRENE-AVION-"+this.getpasajeros()+"-"
                 +this.getmarca()+"-"+this.getmodelo());
   }
}
