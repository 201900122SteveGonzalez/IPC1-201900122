package hilos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_rayo implements Runnable {

    Random posicion = new Random();

    @Override
    public void run() {
        while (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
            JButton flash = CrearRayo(64, 64, 20 + posicion.nextInt(4) * 64, 30, Color.YELLOW);
            GALAGA.galaga.add(flash);
            GALAGA.lista_rayos.agregar(flash);
            mover_objetos movimiento = new mover_objetos(flash);
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
