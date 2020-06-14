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
public class Caballo extends Transporte {
private String nombre;
private String raza;
private int edad;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Caballo(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    @Override
    public void avanzar() {
         System.out.println("AVANCE-CABALLO-"+this.getNombre()+"-"
                 +this.getRaza()+"-"+this.getEdad());
   }

    @Override
    public void frenar() {
         System.out.println("FRENEE-CABALLO-"+this.getNombre()+"-"
                 +this.getRaza()+"-"+this.getEdad());}
    
}
