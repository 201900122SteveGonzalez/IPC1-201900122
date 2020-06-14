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
public class avion_de_guerra implements Transporte {
    int pasajeros = 58;
    String marca = "rockwel";
    String modelo = "KX215";

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
