package hilos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_asteroide implements Runnable {
    Random posicion = new Random();

    @Override
    public void run() {
        while (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
           JButton asteroide = CrearAsteroide(64, 64, 20 + posicion.nextInt(4) * 64, 30, Color.GRAY);
            GALAGA.galaga.add(asteroide);
            
            GALAGA.lista_asteroide1.agregar(asteroide); 
            mover_objetos movimiento = new mover_objetos(asteroide);
            Thread hilo_asteroide = new Thread(movimiento);
            hilo_asteroide.start();
                        
                try {
                //tiempo de creacion
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static JButton CrearAsteroide(int ancho, int alto, int x, int y, Color color) {
        JButton asteroide = new JButton();
        asteroide.setBounds(x, y, ancho, alto);
        asteroide.setBackground(color);
        return asteroide;
    }

}
