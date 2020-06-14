/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2;

/**
 *
 * @author USUARIO
 */
public class caballo_Purasangre implements Transporte {
    String nombre = "michael";
    String raza = "Purasangre";
    int edad = 15;
 

    @Override
    public void avanzar() {
       System.out.println("AVANCE-CABALLO-"+this.nombre+"-"
                 +this.raza+"-"+this.edad);
    }

    @Override
    public void frenar() {
         System.out.println("FRENE-CABALLO-"+this.nombre+"-"
                 +this.raza+"-"+this.edad); }
 
}
