package hilos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class hilo_rayo implements Runnable {
    JPanel panel;
    Random posicion = new Random();
    int tiempo;
    public boolean condicion;
    
    public hilo_rayo(JPanel panel, int tiempo) {
        this.panel = panel;
        this.tiempo = tiempo;
        this.condicion=true;
    }

    @Override
    public void run() {
        while (this.condicion=true) {
            JButton flash = CrearRayo(64, 64, 20 + posicion.nextInt(4) * 64, 30, Color.YELLOW);
            this.panel.add(flash);
            mover_objetos movimiento = new mover_objetos(flash, this.tiempo);
            Thread hilo_flash = new Thread(movimiento);
            hilo_flash.start();
            try {
                //tiempo de creacion
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static JButton CrearRayo(int ancho, int alto, int x, int y, Color color) {
        JButton rayo = new JButton();
        rayo.setBounds(x, y, ancho, alto);
        rayo.setBackground(color);
        return rayo;
    }

}
