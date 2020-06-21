package hilos;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class hilo_asteroide implements Runnable{
  JPanel panel;
  Random posicion = new Random();
  int tiempo;
  public boolean condicion;
    public hilo_asteroide(JPanel panel, int tiempo) {
        this.panel = panel;
        this.tiempo = tiempo;
        this.condicion=true;
    }

    @Override
    public void run() {
       while(this.condicion=true){
            JButton asteroide = CrearAsteroide(64, 64, 20+posicion.nextInt(4)*64, 30, Color.GRAY);
             this.panel.add(asteroide);
             mover_objetos movimiento = new mover_objetos(asteroide, this.tiempo);
             Thread hilo_asteroide = new Thread(movimiento);
             hilo_asteroide.start();
            try {
                //tiempo de creacion
                Thread.sleep(2000);
            } catch (InterruptedException ex) { 
            }
        }
    }
  
   public static JButton CrearAsteroide(int ancho, int alto, int x, int y, Color color){
        JButton asteroide = new JButton();
        asteroide.setBounds(x, y, ancho, alto);
        asteroide.setBackground(color);
        return asteroide;
    }
   
}
