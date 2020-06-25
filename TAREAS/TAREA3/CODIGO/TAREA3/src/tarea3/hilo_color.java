package tarea3;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Steve González
 */
public class hilo_color implements Runnable {

    JButton boton1;
    JButton boton2;

    public hilo_color(JButton boton1, JButton boton2) {
        this.boton1 = boton1;
        this.boton2 = boton2;
    }

    @Override
    public void run() {
        while (true) {
            if (this.boton1.getBackground() == Color.blue) {
                this.boton1.setBackground(Color.red);
                this.boton2.setBackground(Color.blue);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hilo_color.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (this.boton1.getBackground() == Color.red) {
                this.boton1.setBackground(Color.blue);
                this.boton2.setBackground(Color.red);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hilo_color.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
