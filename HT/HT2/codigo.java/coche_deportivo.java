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
public class coche_deportivo implements Transporte {
    String marca = "ferrari";
    int modelo = 2012;
    String tipo = "FF";

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
