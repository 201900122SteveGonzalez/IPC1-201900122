package Listas_Simples;

import java.awt.Color;

/**
 *
 * @author Steve Gónzalez
 */
public class Pila {
    private Nodo cabeza;

    public Pila() {
        this.cabeza = null;
    }
    
    public void push(int Fila, int Columna, int Valor, Color color) {
        //la cabeza va a ser el siguiente del elemento que vamos a insertar
        Nodo nuevo = new Nodo(Fila, Columna, Valor, color);
        if(this.getCabeza()==null){
            this.setCabeza(nuevo);
        }else{
            nuevo.setSiguiente(this.getCabeza());
            this.setCabeza(nuevo);
        }
    }
    
    public Nodo pop(){
        //se eliminar el ultimo nodo que se inserto con el push
        
        Nodo retorno = this.getCabeza();
        this.setCabeza(this.getCabeza().getSiguiente());
        return retorno;
    }
    
   public void imprimir_lista() {
        if (this.getCabeza() == null) {
            System.out.println("pila vacia");
        } else {
            Nodo auxiliar;
            for (auxiliar = this.getCabeza(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
               System.out.println(auxiliar.getFila() + " " + auxiliar.getColumna() + " " + auxiliar.getValor() + " " + auxiliar.getColor());
            }
                System.out.println(auxiliar.getFila() + " " + auxiliar.getColumna() + " " + auxiliar.getValor() + " " + auxiliar.getColor());
        }
    }

    

    /**
     * @return the cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
