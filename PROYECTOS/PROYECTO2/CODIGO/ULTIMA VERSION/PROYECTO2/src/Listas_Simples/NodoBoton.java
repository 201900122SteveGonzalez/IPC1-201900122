package Listas_Simples;

import javax.swing.JButton;
import proyecto2.RecogeBloques;

/**
 *
 * @author STEVE GONZÁLEZ
 */
public class NodoBoton {

    private JButton objeto;
    private NodoBoton siguiente;

    public NodoBoton(JButton objeto) {
        // this.Id = RecogeBloques.contador_botones;
        RecogeBloques.contador_botones++;
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
    public NodoBoton getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoBoton siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the Id
     */
}
