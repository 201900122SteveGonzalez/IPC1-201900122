package hilos;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class hilo_corazon implements Runnable {
  JPanel panel;
  Random posicion = new Random();
  int tiempo;
  int vidas;
  int reloj;
  public boolean condicion;
    public hilo_corazon(JPanel panel, int tiempo, int vidas, int reloj) {
        this.panel = panel;
        this.tiempo = tiempo;
        this.vidas = vidas;
        this.reloj = reloj;
        //this.condicion=true;
    }
    
    @Override
    public void run() {
        if(vidas>0 && reloj>0){
            this.condicion=true;
        }else{
            this.condicion=true;
        }
        while(this.condicion=true){
            JButton vida = Crearcorazon(64, 64, 20+posicion.nextInt(4)*64, 30, Color.RED);
             this.panel.add(vida);
             mover_objetos movimiento = new mover_objetos(vida, this.tiempo);
             Thread hilo_vida = new Thread(movimiento);
             hilo_vida.start();
            try {
                //tiempo de creacion
                Thread.sleep(14000);
            } catch (InterruptedException ex) { 
            }
        }
    }
    
   public static JButton Crearcorazon(int ancho, int alto, int x, int y, Color color){
        JButton corazon = new JButton();
        corazon.setBounds(x, y, ancho, alto);
        corazon.setBackground(color);
        return corazon;
    }
    
}
