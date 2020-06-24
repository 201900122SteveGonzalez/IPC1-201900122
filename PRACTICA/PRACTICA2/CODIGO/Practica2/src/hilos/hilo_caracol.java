package hilos;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import practica2.GALAGA;

public class hilo_caracol implements Runnable {
  Random posicion = new Random();
  
    @Override
    public void run() {
        while(GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0){
            JButton gary = CrearCaracol(64, 64, 20+posicion.nextInt(4)*64, 30, Color.green);
             GALAGA.galaga.add(gary);
             GALAGA.lista_caracoles.agregar(gary);
             mover_objetos movimiento = new mover_objetos(gary);
             Thread hilo_gary = new Thread(movimiento);
             hilo_gary.start();
            try {
                //tiempo de creacion
                Thread.sleep(15000);
            } catch (InterruptedException ex) { 
            }
        }
   }
    
   public static JButton CrearCaracol(int ancho, int alto, int x, int y, Color color){
        JButton caracol = new JButton();
        caracol.setBounds(x, y, ancho, alto);
        caracol.setBackground(color);
        return caracol;
    }
   
}
