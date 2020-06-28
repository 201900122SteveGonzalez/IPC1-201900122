package Listas_Simples;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Steve González
 */

public class Nodo {

    private int Fila;
    private int Columna;
    private int Valor;
    private Color color;
    private Nodo siguiente;

    public Nodo(int Fila, int Columna, int Valor, Color color) {
        this.Fila = Fila;
        this.Columna = Columna;
        this.Valor = Valor;
        this.color = color;
        this.siguiente = null;
    }

    Nodo(JButton objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the Fila
     */
    public int getFila() {
        return Fila;
    }

    /**
     * @param Fila the Fila to set
     */
    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    /**
     * @return the Columna
     */
    public int getColumna() {
        return Columna;
    }

    /**
     * @param Columna the Columna to set
     */
    public void setColumna(int Columna) {
        this.Columna = Columna;
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
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
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
    
   


}
