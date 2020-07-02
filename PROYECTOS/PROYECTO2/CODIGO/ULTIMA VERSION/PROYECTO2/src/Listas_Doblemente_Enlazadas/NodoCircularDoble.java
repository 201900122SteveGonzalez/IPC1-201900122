package Listas_Doblemente_Enlazadas;

/**
 *
 * @author STEVE GONZÁLEZ
 */
public class NodoCircularDoble {

    private int Valor;
    private String color;
    private int ID;
    private NodoCircularDoble siguiente;
    private NodoCircularDoble anterior;

    public NodoCircularDoble(int Valor, String color, int ID) {
        this.Valor = Valor;
        this.color = color;
        this.ID = ID;
        this.siguiente = this;
        this.anterior = this;
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

    /**
     * @return the siguiente
     */
    public NodoCircularDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCircularDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCircularDoble anterior) {
        this.anterior = anterior;
    }

}
