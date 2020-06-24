package hilos;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_corazon implements Runnable {
    Random posicion = new Random();

    @Override
    public void run() {
        while (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
           JButton vida = Crearcorazon(64, 64, 20 + posicion.nextInt(4) * 64, 30, Color.RED);
            GALAGA.galaga.add(vida);
            GALAGA.lista_vidas1.agregar(vida);
            if(GALAGA.lista_asteroide1.choque(GALAGA.nave)){//nave con asteroide
                     GALAGA.contador_vidas--;
                     GALAGA.vidas.setText(String.valueOf(GALAGA.contador_vidas));
                   //  break;
            }  
            mover_objetos movimiento = new mover_objetos(vida);
            Thread hilo_vida = new Thread(movimiento);
            hilo_vida.start();
             
            try {
                //tiempo de creacion
                Thread.sleep(14000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo_corazon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public JButton Crearcorazon(int ancho, int alto, int x, int y, Color color) {
        JButton corazon = new JButton();
        corazon.setBounds(x, y, ancho, alto);
        corazon.setBackground(color);
        return corazon;
    }

}
