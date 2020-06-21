package hilos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class hilo_misil implements Runnable {
  JButton misil;  
  public boolean condicion;

    public hilo_misil(JButton misil) {
        this.misil = misil;
        this.condicion=true;
    }

    @Override
    public void run() {
    while(this.condicion=true){
            misil.setBounds(misil.getX(), misil.getY()-64, 64, 64);
                if(misil.getY()<=84){
                    misil.setVisible(false);
                }
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
            Logger.getLogger(mover_objetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
  
}
