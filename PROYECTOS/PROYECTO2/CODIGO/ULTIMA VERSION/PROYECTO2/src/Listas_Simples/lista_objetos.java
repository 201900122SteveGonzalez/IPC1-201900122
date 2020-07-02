package Listas_Simples;

import java.awt.Color;
import java.awt.geom.Area;
import javax.swing.JButton;
import proyecto2.RecogeBloques;

/**
 *
 * @author STEVE GONZÁLEZ
 */
public class lista_objetos {

    private NodoBoton primero;

    public void agregar(JButton objeto) {
        NodoBoton auxiliar = new NodoBoton(objeto);
        if (this.getPrimero() == null) {
            this.setPrimero(auxiliar);
        } else {
            NodoBoton actual;
            for (actual = this.getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }

    public void reiniciar() {
        if (this.getPrimero() == null) {
            System.out.println("ya se vacio la lista");
        } else {
            NodoBoton temporal = getPrimero();
            while (temporal != null) {
                temporal.getObjeto().setVisible(false);
                temporal = temporal.getSiguiente();
            }
            this.getPrimero().setSiguiente(null);
            this.setPrimero(null);
        }
    }

    public void eliminarBoton(JButton identificador) {
        NodoBoton temporal = primero;

        while (temporal != null) {
            if (temporal.getSiguiente() != null) {
                if (temporal.getSiguiente().getObjeto() == identificador) {
                    NodoBoton temporalSiguiente = temporal.getSiguiente();
                    temporal.setSiguiente(temporalSiguiente.getSiguiente());
                    return;
                }
            } else {
            }
            temporal = temporal.getSiguiente();
        }
    }

    /**
     *
     * @param botonNuevo
     * @return
     */
    public void choque(JButton botonNuevo) {
        NodoBoton temporal = getPrimero();
        while (temporal != null) {
            Area areaA = new Area(temporal.getObjeto().getBounds());
            Area areaB = new Area(botonNuevo.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                String color;
                int valor;
                if (temporal.getObjeto().getBackground() == Color.RED) {
                    RecogeBloques.rojos++;
                    valor = Integer.parseInt(temporal.getObjeto().getText());
                    color = "ROJO";
                    RecogeBloques.circular.insertar(valor, color, RecogeBloques.rojos);
                }
                if (temporal.getObjeto().getBackground() == Color.BLUE) {
                    RecogeBloques.azules++;
                    valor = Integer.parseInt(temporal.getObjeto().getText());
                    color = "AZUL";
                    RecogeBloques.lista_doble.insertar(valor, color, RecogeBloques.azules);
                }
                if (temporal.getObjeto().getBackground() == Color.YELLOW) {
                    RecogeBloques.amarillos++;
                    valor = Integer.parseInt(temporal.getObjeto().getText());
                    color = "AMARILLO";
                    RecogeBloques.pila.push(valor, color, RecogeBloques.amarillos);
                }
                if (temporal.getObjeto().getBackground() == Color.GREEN) {
                    RecogeBloques.verdes++;
                    valor = Integer.parseInt(temporal.getObjeto().getText());
                    color = "VERDE";
                    RecogeBloques.cola.encolar(valor, color, RecogeBloques.verdes);
                }
                this.eliminarBoton(temporal.getObjeto());
                temporal.getObjeto().setVisible(false);
            }
            temporal = temporal.getSiguiente();
        }
    }

    public boolean destruccion(JButton botonNuevo, lista_objetos meteorito) {
        NodoBoton temporal = getPrimero();
        NodoBoton auxiliar = meteorito.getPrimero();
        while (temporal != null && auxiliar != null) {
            Area areaA = new Area(auxiliar.getObjeto().getBounds());
            Area areaB = new Area(botonNuevo.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                auxiliar.getObjeto().setVisible(false);
                meteorito.eliminarBoton(auxiliar.getObjeto());
                this.eliminarBoton(botonNuevo);
                botonNuevo.setVisible(false);
                return true;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return false;
    }

    public void llenar_tablero() {
        NodoBoton auxiliar;
        if (this.getPrimero() == null) {
            System.out.println("lista vacia");
        } else {
            for (auxiliar = getPrimero(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
                RecogeBloques.MENU.add(auxiliar.getObjeto());
            }
            RecogeBloques.MENU.add(auxiliar.getObjeto());
        }
    }

    /**
     * @return the primero
     */
    public NodoBoton getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoBoton primero) {
        this.primero = primero;
    }

}
