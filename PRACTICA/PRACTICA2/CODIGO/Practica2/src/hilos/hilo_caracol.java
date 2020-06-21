package hilos;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class hilo_caracol implements Runnable {
  JPanel panel;
  Random posicion = new Random();
  int tiempo;
  public boolean condicion;
    public hilo_caracol(JPanel panel, int tiempo) {
        this.panel = panel;
        this.tiempo = tiempo;
        this.condicion=true;
    } 
  
    @Override
    public void run() {
        while(this.condicion=true){
            JButton gary = CrearCaracol(64, 64, 20+posicion.nextInt(4)*64, 30, Color.green);
             this.panel.add(gary);
             mover_objetos movimiento = new mover_objetos(gary, this.tiempo);
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
