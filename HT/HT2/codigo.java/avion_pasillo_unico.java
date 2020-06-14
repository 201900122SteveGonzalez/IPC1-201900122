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
public class avion_pasillo_unico implements Transporte {
    int pasajeros = 10;
    String marca = "Airbus";
    String modelo = "A380";

    @Override
    public void avanzar() {
       System.out.println("AVANCE-AVION-"+this.pasajeros+"-"
                 +this.marca+"-"+this.modelo);
    }

    @Override
    public void frenar() {
         System.out.println("FRENE-AVION-"+this.pasajeros+"-"
                 +this.marca+"-"+this.modelo);  }
 
}
