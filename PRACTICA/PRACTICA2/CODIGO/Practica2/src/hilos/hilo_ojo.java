package hilos;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class hilo_ojo implements Runnable{
  JPanel panel;
  Random posicion = new Random();
  int tiempo;
  public boolean condicion;
    public hilo_ojo(JPanel panel, int tiempo) {
        this.panel = panel;
        this.tiempo = tiempo;
        this.condicion=true;
    }

    @Override
    public void run() {
          while(this.condicion=true){
            JButton ojo = CrearOjo(64, 64, 20+posicion.nextInt(4)*64, 30, Color.WHITE);
             this.panel.add(ojo);
             mover_objetos movimiento = new mover_objetos(ojo, this.tiempo);
             Thread hilo_ojo = new Thread(movimiento);
             hilo_ojo.start();
            try {
                //tiempo de creacion
                Thread.sleep(10000);
            } catch (InterruptedException ex) { 
            }
    }
    }
    
     public static JButton CrearOjo(int ancho, int alto, int x, int y, Color color){
        JButton ojo = new JButton();
        ojo.setBounds(x, y, ancho, alto);
        ojo.setBackground(color);
        return ojo;
    }
  
}
