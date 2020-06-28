/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht4;

import javax.swing.JTextArea;

/**
 *
 * @author USUARIO
 */
public class lista_circular {
    private NodoCircular cabeza;

    public lista_circular() {
        this.cabeza=null;
    }
    
    public void insertar (int ID, String Valor) {
        //la cabeza se va moviendo de posicion
        NodoCircular nuevo = new NodoCircular(ID, Valor);
        if(this.getCabeza()!=null){
            nuevo.setSiguiente(this.getCabeza().getSiguiente());
            this.getCabeza().setSiguiente(nuevo);       
        }
        this.setCabeza(nuevo);      
    }
    
    public void generar_listas(JTextArea text){  
        text.setText("");
         String encabezado = "digraph G { \n";
         String cierre = "}";
       int nodoActual = 1;
                    String auxiliar="";
          NodoCircular actual =this.getCabeza();
          while(actual.getSiguiente() != this.getCabeza()){
                      nodoActual++;
              auxiliar = auxiliar+(("nodo" + actual.getID() + " [label  = \"" + actual.getID() +","+actual.getValor() + "\"];\n"));
              auxiliar = auxiliar+(("nodo" + (nodoActual-1)  + "->nodo" + nodoActual + "\n"));
              actual = actual.getSiguiente();
          }
                      auxiliar = auxiliar+(("nodo" + actual.getID() + " [label  = \"" + actual.getID() +","+actual.getValor() + "\"];\n"));
                      auxiliar = auxiliar+(("nodo" + (nodoActual)  + "->nodo1"  + "\n")); 
          String codigo = encabezado+auxiliar+cierre;
        text.setText(codigo); 
    }

    /**
     * @return the cabeza
     */
    public NodoCircular getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoCircular cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
