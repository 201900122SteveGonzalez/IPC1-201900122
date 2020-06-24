package estructuras;
import java.awt.geom.Area;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class lista_objetos {

    private Nodo primero;

    public void agregar(JButton objeto) {
        Nodo auxiliar = new Nodo(objeto);
        if (getPrimero() == null) {
            setPrimero(auxiliar);
        } else {
            Nodo actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }
       
    public void eliminarBoton(JButton identificador){
        Nodo temporal = primero;
        
        while(temporal!=null){
        if(temporal.getSiguiente()!=null){
            if(temporal.getSiguiente().getObjeto()==identificador){
                Nodo temporalSiguiente = temporal.getSiguiente();
                temporal.setSiguiente(temporalSiguiente.getSiguiente());
                return;
                }
            }else{
        }
        temporal = temporal.getSiguiente();
    }
    }

    /**
     *
     * @param botonNuevo
     * @return
     */
    public boolean choque(JButton botonNuevo) {
        Nodo temporal = getPrimero();
        while (temporal != null) {
            Area areaA = new Area(temporal.getObjeto().getBounds());
            Area areaB = new Area(botonNuevo.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                temporal.getObjeto().setVisible(false);
                this.eliminarBoton(botonNuevo);
                return true;
            }
            temporal = temporal.getSiguiente();
        }
        return false;
   }
    
     public boolean destruccion(JButton botonNuevo, lista_objetos meteorito) {
        Nodo temporal = getPrimero();
        Nodo auxiliar = meteorito.getPrimero();
        while (temporal != null && auxiliar!=null) {
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
    

    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

}
