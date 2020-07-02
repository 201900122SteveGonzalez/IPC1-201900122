package Listas_Doblemente_Enlazadas;

import java.awt.Color;
import javax.swing.JTextArea;
import proyecto2.RecogeBloques;

/**
 *
 * @author STEVE GONZÁLEZ
 */
public class lista_circular_doblemente_enlazada {

    private NodoCircularDoble cabeza;
    private int encontrados = 0;
    private int primerID[] = new int[100];

    public lista_circular_doblemente_enlazada() {
        this.cabeza = null;
    }

    public void generar_listas(JTextArea text) {
        text.setText("");
        if (this.getCabeza() == null) {
            text.setText("LISA VACIA");
        } else {
            String encabezado = "digraph G { \n";
            String cierre = "}";
            String auxiliar = "";
            NodoCircularDoble actual = this.getCabeza();
            int primero = this.getCabeza().getID();
            while (actual.getSiguiente() != this.getCabeza()) {
                auxiliar = auxiliar + ((actual.getID() + " [label  = \"" + actual.getValor() + "," + actual.getColor() + "\"];\n"));
                auxiliar = auxiliar + ((actual.getID() + "->" + actual.getSiguiente().getID() + "\n"));
                auxiliar = auxiliar + ((actual.getSiguiente().getID() + "->" + actual.getID() + "\n"));
                actual = actual.getSiguiente();
            }
            auxiliar = auxiliar + ((actual.getID() + " [label  = \"" + actual.getValor() + "," + actual.getColor() + "\"];\n"));
            auxiliar = auxiliar + ((actual.getID() + "->" + actual.getSiguiente().getID() + "\n"));
            auxiliar = auxiliar + ((actual.getSiguiente().getID() + "->" + actual.getID() + "\n"));
            String codigo = encabezado + auxiliar + cierre;
            text.setText(codigo);
        }
        text.setForeground(Color.RED);
    }

    public void reiniciar() {
        if (this.getCabeza() == null) {
            System.out.println("ya esta vacia");
        } else {
            this.getCabeza().setSiguiente(null);
            this.getCabeza().setAnterior(null);
            this.setCabeza(null);
            RecogeBloques.rojos = 0;
        }
    }

    public void eliminar(int Valor) {
        boolean verificacion = existe2(Valor);
        NodoCircularDoble verificador;
        if (verificacion == true) {
            if (this.getCabeza() != null) {
                verificador = this.getCabeza();
                while (verificador.getSiguiente() != this.getCabeza()) {
                    if (verificador.getSiguiente().getValor() == Valor && verificador.getSiguiente().getID() == primerID[0]) {
                        verificador.setSiguiente(verificador.getSiguiente().getSiguiente());
                        verificador.getSiguiente().setAnterior(verificador);
                        break;
                    }
                    verificador = verificador.getSiguiente();
                }

                if (this.getCabeza().getValor() == Valor && this.getCabeza().getID() == primerID[0]) {
                    // 3 elementos
                    if (this.getCabeza().getSiguiente().getSiguiente().getSiguiente() == this.getCabeza() && this.getCabeza().getAnterior().getAnterior() != this.getCabeza()) {
                        this.setCabeza(this.getCabeza().getSiguiente());
                        this.getCabeza().setAnterior(this.getCabeza().getAnterior().getAnterior());
                        this.getCabeza().getAnterior().setSiguiente(this.getCabeza());
                    } else //4 o mas elementos funciona
                    if (this.getCabeza().getSiguiente().getSiguiente() != this.getCabeza() && this.getCabeza().getSiguiente() != this.getCabeza()) {
                        this.setCabeza(this.getCabeza().getSiguiente());
                        this.getCabeza().setAnterior(this.getCabeza().getAnterior().getAnterior());
                        this.getCabeza().getAnterior().setSiguiente(this.getCabeza());
                        System.out.println("anomalia detectada");
                    } else //2 elementos
                    if (this.getCabeza().getSiguiente().getSiguiente() == this.getCabeza() && this.getCabeza().getSiguiente() != this.getCabeza()) {
                        this.setCabeza(verificador);
                        this.getCabeza().setSiguiente(this.getCabeza());
                        this.getCabeza().setAnterior(this.getCabeza());
                    } else //1 elemento
                    if (this.getCabeza().getSiguiente() == this.getCabeza() && this.getCabeza().getAnterior() == this.getCabeza()) {
                        this.getCabeza().setSiguiente(null);
                        this.getCabeza().setAnterior(null);
                        this.setCabeza(null);
                    }
                }
            }
            encontrados = 0;
        }
    }

    public void insertar(int Valor, String color, int ID) {
        boolean verificacion = existe(Valor);
        if (verificacion == false) {
            NodoCircularDoble nuevo = new NodoCircularDoble(Valor, color, ID);
            if (this.getCabeza() != null) {
                nuevo.setSiguiente(this.getCabeza().getSiguiente());
                this.getCabeza().setSiguiente(nuevo);
                nuevo.setAnterior(this.getCabeza());
            }
            this.setCabeza(nuevo);
            this.getCabeza().getSiguiente().setAnterior(nuevo);
        }
    }

    public void insertar2(int Valor, String color, int ID) {
        NodoCircularDoble nuevo = new NodoCircularDoble(Valor, color, ID);
        if (this.getCabeza() != null) {
            nuevo.setSiguiente(this.getCabeza().getSiguiente());
            this.getCabeza().setSiguiente(nuevo);
            nuevo.setAnterior(this.getCabeza());
        }
        this.setCabeza(nuevo);
        this.getCabeza().getSiguiente().setAnterior(nuevo);
    }

    public boolean existe(int Valor) {
        boolean repetido = false;
        NodoCircularDoble verificador;
        if (this.getCabeza() != null) {
            for (verificador = this.getCabeza(); verificador.getSiguiente() != this.getCabeza(); verificador = verificador.getSiguiente()) {
                if (verificador.getValor() == Valor) {
                    RecogeBloques.rojos--;
                    repetido = true;
                }
            }
            if (verificador.getValor() == Valor) {
                RecogeBloques.rojos--;
                repetido = true;
            }
        }
        return repetido;
    }

    public boolean existe2(int Valor) {
        boolean repetido = false;
        NodoCircularDoble verificador;
        if (this.getCabeza() != null) {
            for (verificador = this.getCabeza(); verificador.getSiguiente() != this.getCabeza(); verificador = verificador.getSiguiente()) {
                if (verificador.getValor() == Valor) {
                    repetido = true;
                    primerID[encontrados] = verificador.getID();
                    encontrados++;
                }
            }
            if (verificador.getValor() == Valor) {
                repetido = true;
                primerID[encontrados] = verificador.getID();
                encontrados++;
            }
        }
        return repetido;
    }

    public void imprimir() {
        System.out.println("LISTA CIRCULAR DOBLEMENTE ENLAZADA");
        if (this.getCabeza() == null) {
            System.out.println("lista vacia");
        } else {
            NodoCircularDoble actual = this.getCabeza();
            while (actual.getSiguiente() != this.getCabeza()) {
                System.out.println(actual.getValor() + " " + actual.getColor() + " " + actual.getID());
                actual = actual.getSiguiente();
            }
            System.out.println(actual.getValor() + " " + actual.getColor() + " " + actual.getID());
        }
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
