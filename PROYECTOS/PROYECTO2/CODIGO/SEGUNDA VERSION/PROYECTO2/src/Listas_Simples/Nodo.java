package Listas_Simples;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Steve González
 */

public class Nodo {
    
//    private int Fila;
//    private int Columna;
    private int Valor;
    private String color;
    private int ID;
    private Nodo siguiente;

    public Nodo(int Valor, String color, int ID) {
        this.Valor = Valor;
        this.color = color;
        this.ID = ID;
        this.siguiente = null;
    }

    Nodo(JButton objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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

    Object getObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
   


}
