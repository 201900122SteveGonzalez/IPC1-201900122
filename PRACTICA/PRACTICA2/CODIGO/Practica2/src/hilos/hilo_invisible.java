package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class hilo_invisible implements Runnable {

    JButton nave;
    int contador;
    public boolean poder;

    public hilo_invisible(JButton nave, int contador) {
        this.nave = nave;
        this.contador = contador;
        this.poder = true;
    }

    @Override
    public void run() {
        if (this.contador > 0) {
            poder = true;
        } else {
            poder = false;
        }
        while (poder == true) {
            this.nave.setBackground(java.awt.Color.BLACK);
            try {
                Thread.sleep(6000);
                this.nave.setBackground(java.awt.Color.BLUE);
                break;
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo_invisible.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
