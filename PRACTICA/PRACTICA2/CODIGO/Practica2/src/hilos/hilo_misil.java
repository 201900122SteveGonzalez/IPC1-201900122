package hilos;
import estructuras.Nodo;
import estructuras.lista_objetos;
import java.awt.geom.Area;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_misil implements Runnable {
    public JButton misil;

    public hilo_misil(JButton misil) {
        this.misil = misil;
    }

    public boolean choque_misil(JButton devastator, lista_objetos lista) {
        Nodo temporal = lista.getPrimero();
        while (temporal != null) {
            Area areaA = new Area(temporal.getObjeto().getBounds());
            Area areaB = new Area(devastator.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                temporal.getObjeto().setVisible(false);
                lista.eliminarBoton(devastator);
                return true;
            }
            temporal = temporal.getSiguiente();
        }
        return false;
    }

    @Override
    public void run() {
        while (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
            misil.setBounds(misil.getX(), misil.getY() - 64, 64, 64);
            if (misil.getY() <= 84) {
                misil.setVisible(false);
                GALAGA.lista_misiles.eliminarBoton(misil);
            }
            
             if(GALAGA.lista_misiles.destruccion(misil, GALAGA.lista_asteroide1)){
                  GALAGA.contador_punteo = GALAGA.contador_punteo+100;
                  GALAGA.punteo.setText(String.valueOf(GALAGA.contador_punteo));
                  break;
                 }
            if (choque_misil(misil, GALAGA.lista_vidas1) == true) {
                misil.setVisible(false);
                GALAGA.contador_vidas++;
                if (GALAGA.contador_vidas >= 3) {
                    GALAGA.contador_vidas = 3;
                }
                GALAGA.vidas.setText(String.valueOf(GALAGA.contador_vidas));
                break;
            }
            if (choque_misil(misil, GALAGA.lista_caracoles) == true) {
                misil.setVisible(false);
                if (GALAGA.rapidez > 1) {
                    GALAGA.rapidez--;
                    GALAGA.velocidad.setText(String.valueOf(GALAGA.rapidez));
                }
                if (GALAGA.rapidez <= 1) {
                    GALAGA.velocidad.setText("1");
                    GALAGA.rapidez = 1;
                    break;
                }
                break;
            }

            if (choque_misil(misil, GALAGA.lista_rayos) == true) {
                misil.setVisible(false);
                GALAGA.rapidez++;
                if (GALAGA.rapidez > 5) {
                    GALAGA.rapidez = 5;
                }
                GALAGA.velocidad.setText(String.valueOf(GALAGA.rapidez));
                break;
            }

            if (choque_misil(misil, GALAGA.lista_invisibles) == true) {
                misil.setVisible(false);
                GALAGA.contador_ojos++;
                GALAGA.poder.setText(String.valueOf(GALAGA.contador_ojos));
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(mover_objetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
