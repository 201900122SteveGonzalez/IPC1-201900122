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
public class coche_regular implements Transporte {
    String marca = "Toyota";
    int modelo = 2001;
    String tipo = "Sedan";

    @Override
    public void avanzar() {
       System.out.println("AVANCE-AUTO-"+this.marca+"-"
                 +this.modelo+"-"+this.tipo);
    }

    @Override
    public void frenar() {
         System.out.println("FRENE-AUTO-"+this.marca+"-"
                 +this.modelo+"-"+this.tipo);
 
}
}
