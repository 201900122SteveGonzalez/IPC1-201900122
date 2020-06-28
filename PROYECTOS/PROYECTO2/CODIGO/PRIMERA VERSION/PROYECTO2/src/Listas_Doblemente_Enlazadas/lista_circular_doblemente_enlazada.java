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
public class lista_circular_doblemente_enlazada {
    private NodoCircularDoble cabeza;

    public lista_circular_doblemente_enlazada() {
        this.cabeza = null;
    }

    public void insertar(String Nombre, String Apellido, int Edad) {
      NodoCircularDoble nuevo = new NodoCircularDoble(Nombre, Apellido, Edad);
        if(this.getCabeza()!=null){
            nuevo.setSiguiente(this.getCabeza().getSiguiente());
            this.getCabeza().setSiguiente(nuevo);  
            nuevo.setAnterior(this.getCabeza());
        }
        this.setCabeza(nuevo);
        this.getCabeza().getSiguiente().setAnterior(nuevo);
    }
    /**
     * @return the cabeza
     */
    public NodoCircularDoble getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoCircularDoble cabeza) {
        this.cabeza = cabeza;
    }
    
    
    
}
