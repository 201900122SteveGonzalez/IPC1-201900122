package hilos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_ojo implements Runnable {

    Random posicion = new Random();

    @Override
    public void run() {
        while (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
            JButton ojo = CrearOjo(64, 64, 20 + posicion.nextInt(4) * 64, 30, Color.CYAN);
            GALAGA.galaga.add(ojo);
            GALAGA.lista_invisibles.agregar(ojo);
            mover_objetos movimiento = new mover_objetos(ojo);
            Thread hilo_ojo = new Thread(movimiento);
            hilo_ojo.start();
            try {
                //tiempo de creacion
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static JButton CrearOjo(int ancho, int alto, int x, int y, Color color) {
        JButton ojo = new JButton();
        ojo.setBounds(x, y, ancho, alto);
        ojo.setBackground(color);
        return ojo;
    }

}
