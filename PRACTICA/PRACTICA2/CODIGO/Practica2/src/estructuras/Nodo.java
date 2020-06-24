/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import javax.swing.JButton;
import practica2.GALAGA;

/**
 *
 * @author USUARIO
 */
public class Nodo {
//    private int ID;
    private JButton objeto;
    private Nodo siguiente;
     private int Id;
    public Nodo(JButton objeto) {
        this.Id = GALAGA.contador_corazones;
        GALAGA.contador_corazones++;
        this.objeto = objeto;
        this.siguiente = null;
    }

    /**
     * @return the objeto
     */
    public JButton getObjeto() {
        return objeto;
    }

    /**
     * @param objeto the objeto to set
     */
    public void setObjeto(JButton objeto) {
        this.objeto = objeto;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    

    }
    
