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
public class Coche extends Transporte {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @param tipoVehiculo the tipoVehiculo to set
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    private String marca;
    private int modelo;
    private String tipoVehiculo;

    public Coche(String marca, int modelo, String tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }  
    
@Override
    public void avanzar() {
               System.out.println("AVANCE-COCHE-"+this.getMarca()+"-"
                 +this.getModelo()+"-"+this.getTipoVehiculo());
   }

    @Override
    public void frenar() {
                    System.out.println("FRENE-COCHE-"+this.getMarca()+"-"
                 +this.getModelo()+"-"+this.getTipoVehiculo());
   }
}
