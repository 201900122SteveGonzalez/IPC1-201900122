package Listas_Simples;

import java.awt.Color;

/**
 *
 * @author Steve González
 */
public class Cola {

    private Nodo cabeza;

    public void encolar(int Fila, int Columna, int Valor, Color color) {
        //inserta el nodo al final de la lista
        Nodo auxiliar = new Nodo(Fila, Columna, Valor, color);
        if (getCabeza() == null) {
            setCabeza(auxiliar);
        } else {
            Nodo actual;
            for (actual = getCabeza(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }

    public Nodo desencolar() {
        //elimina el primer nodo de la lista
        Nodo retorno = null;
        if (this.getCabeza() != null) {
            retorno = this.getCabeza();
            if (this.getCabeza().getSiguiente() != null) {
                this.setCabeza(retorno.getSiguiente());
            } else {
                this.setCabeza(null);
            }
        }

        return retorno;
    }

    public void imprimir_lista() {
        if (this.getCabeza() == null) {
            System.out.println("cola vacia");
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
