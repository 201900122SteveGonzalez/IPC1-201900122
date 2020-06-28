/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Simples;

import java.awt.geom.Area;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class lista_objetos {
    private NodoBoton primero;

    public void agregar(JButton objeto) {
        NodoBoton auxiliar = new NodoBoton(objeto);
        if (this.getPrimero() == null) {
            this.setPrimero(auxiliar);
        } else {
            NodoBoton actual;
            for (actual = this.getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }
       
    public void eliminarBoton(JButton identificador){
        NodoBoton temporal = primero;
        
        while(temporal!=null){
        if(temporal.getSiguiente()!=null){
            if(temporal.getSiguiente().getObjeto()==identificador){
                NodoBoton temporalSiguiente = temporal.getSiguiente();
                temporal.setSiguiente(temporalSiguiente.getSiguiente());
                return;
                }
            }else{
        }
        temporal = temporal.getSiguiente();
    }
    }

    /**
     *
     * @param botonNuevo
     * @return
     */
    public boolean choque(JButton botonNuevo) {
        NodoBoton temporal = getPrimero();
        while (temporal != null) {
            Area areaA = new Area(temporal.getObjeto().getBounds());
            Area areaB = new Area(botonNuevo.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                temporal.getObjeto().setVisible(false);
                //guardar
                this.eliminarBoton(botonNuevo);
                return true;
            }
            temporal = temporal.getSiguiente();
        }
        return false;
   }
    
     public boolean destruccion(JButton botonNuevo, lista_objetos meteorito) {
        NodoBoton temporal = getPrimero();
        NodoBoton auxiliar = meteorito.getPrimero();
        while (temporal != null && auxiliar!=null) {
            Area areaA = new Area(auxiliar.getObjeto().getBounds());
            Area areaB = new Area(botonNuevo.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                auxiliar.getObjeto().setVisible(false);
                meteorito.eliminarBoton(auxiliar.getObjeto());
                this.eliminarBoton(botonNuevo);
                botonNuevo.setVisible(false);
                return true;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return false;
   }
    

    /**
     * @return the primero
     */
    public NodoBoton getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoBoton primero) {
        this.primero = primero;
    }

}
