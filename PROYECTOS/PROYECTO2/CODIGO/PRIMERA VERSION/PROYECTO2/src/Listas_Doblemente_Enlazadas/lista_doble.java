/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Doblemente_Enlazadas;

/**
 *
 * @author USUARIO
 */
public class lista_doble {
    private NodoDoble primero;

    public lista_doble() {
        this.primero=null;
    }
    
    public void insertar(String Nombre, String Apellido, int Edad){
        NodoDoble auxiliar = new NodoDoble(Nombre, Apellido, Edad);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
            primero.setAnterior(null);
            primero.setSiguiente(null);
        } else {
            NodoDoble actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
            auxiliar.setAnterior(actual);//nueva linea
            auxiliar.setSiguiente(null);
          //  actual = auxiliar;
        }
    }

    /**
     * @return the primero
     */
    public NodoDoble getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }



}
